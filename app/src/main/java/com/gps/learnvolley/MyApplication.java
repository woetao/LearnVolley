package com.gps.learnvolley;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by max on 15/8/17.
 */
public class MyApplication extends Application {
    public static RequestQueue queues;
    @Override
    public void onCreate() {
        super.onCreate();
        queues = Volley.newRequestQueue(getApplicationContext());
    }

    public static  RequestQueue getHttpQueues() {
        return  queues;
    }
}
