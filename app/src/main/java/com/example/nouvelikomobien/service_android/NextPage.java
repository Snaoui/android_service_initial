package com.example.nouvelikomobien.service_android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Chronometer;
import android.util.Log;
import android.os.SystemClock;

/**
 * Created by nouvelikomobien on 07/11/2017.
 */

public class NextPage extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }


    public void doClick(View target)
    {
        Chronometer chronometer = (Chronometer)findViewById(R.id.chronometer2);
        switch(target.getId())
        {
            case R.id.buttonStartChr:
            {


                break;
            }
            case R.id.buttonStopChr:
            {

                break;

            }


        }
    }

}
