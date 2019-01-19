package com.allysoftsolutions.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );asdas
        setContentView( R.layout.activity_main );


        Toast.makeText(this, "lol", Toast.LENGTH_SHORT).show();
    }
}
