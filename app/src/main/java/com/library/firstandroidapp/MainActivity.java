package com.library.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.library.android_demo_lib.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloWorld.printLog("LIBRARYTAG1","FROM ANDROID STUDIO");
    }
}