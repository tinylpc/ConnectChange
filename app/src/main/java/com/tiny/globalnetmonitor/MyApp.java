package com.tiny.globalnetmonitor;

import android.app.Application;

import com.tiny.connect_change.ConnectionChangeInit;

/**
 * Created by tiny on 16/11/26.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ConnectionChangeInit.init(getApplicationContext());
    }
}
