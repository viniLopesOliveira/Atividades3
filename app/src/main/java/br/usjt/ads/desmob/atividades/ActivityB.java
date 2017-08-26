package br.usjt.ads.desmob.atividades;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityB extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
    public void startActivityC(View view){

        Intent intent = new Intent(this, ActivityC.class);
        startActivity(intent);
    }
    public void finishActivityB(View view)
    {

        finish();
    }
}
