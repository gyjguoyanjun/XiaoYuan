package com.example.tianjieyu.xiaoyuan.application;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * data:2017/6/20
 * author:郭彦君(Administrator)
 * function:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}