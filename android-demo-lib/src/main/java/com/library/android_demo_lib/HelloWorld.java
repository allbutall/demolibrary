package com.library.android_demo_lib;

import android.util.Log;

public class HelloWorld {
    public static void main(String[] args){
        // Main Method
    }

    // Prints message with Tag in LogCat
    public static void printLog(String tag, String message){
        Log.d(tag,message);
    }
}
