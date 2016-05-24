package com.example.apollo.orientation;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss");
    String currentDateandTime = sdf.format(new Date());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textView);

        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        String tag = "Device orientation: ";
        int orientation = getResources().getConfiguration().orientation;

        switch (orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                Log.d("Device orientation", tag + "ORIENTATION_PORTRAIT");
                tv.setText(currentDateandTime);
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                Log.d("Device orientation", tag + "ORIENTATION_LAN DSCAPE");
                tv.setText(currentDateandTime);
                break;
            case Configuration.ORIENTATION_UNDEFINED:
                Log.d("Device orientation", tag + "ORIENTATION_UNDEFINED");
                tv.setText(currentDateandTime);
                break;
            default:
                Log.d("Device orientation", tag + "default value");
                tv.setText(currentDateandTime);
                break;
        }


    }


}
