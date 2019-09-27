package com.xsoft.dianliangpin;

import android.app.Application;

public class DLPApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        NetService.getInstance().init();
    }
}
