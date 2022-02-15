package br.com.aluno.app20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    SumarioFragment f = new SumarioFragment();
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();
    ft.replace(R.id.frameLayout, f);
    ft.commit();
  }

  public void OnClickedSumario(View v){
    getSupportFragmentManager().beginTransaction()
        .replace(R.id.frameLayout, new SumarioFragment())
        .commit();
  }

  public void OnClickedConteudo(View v){
    getSupportFragmentManager().beginTransaction()
        .replace(R.id.frameLayout, new ConteudoFragment())
        .commit();
  }
}