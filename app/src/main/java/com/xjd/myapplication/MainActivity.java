package com.xjd.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JniUtils niUjtils = new JniUtils();
        niUjtils.playMyMedia("http://blog.csdn.net/ywl5320");
    }


}
