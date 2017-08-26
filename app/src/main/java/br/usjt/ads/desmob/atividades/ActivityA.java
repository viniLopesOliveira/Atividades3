package br.usjt.ads.desmob.atividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class ActivityA extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void startActivityB(View view){

        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }
    public void startActivityC(View view){

        Intent intent = new Intent(this, ActivityC.class);
        startActivity(intent);
    }
    public void finishActivityA(View view)
    {

        finish();
    }


    }
