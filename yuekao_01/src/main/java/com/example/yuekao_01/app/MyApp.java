package com.example.yuekao_01.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
