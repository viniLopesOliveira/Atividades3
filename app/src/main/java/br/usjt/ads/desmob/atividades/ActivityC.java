package br.usjt.ads.desmob.atividades;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityC extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }
    public void startActivityB(View view){

        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }
    public void finishActivityC(View view)
    {

        finish();
    }
}
