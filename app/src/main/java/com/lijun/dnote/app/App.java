package com.lijun.dnote.app;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by XhinLiang on 2017/5/13.
 * xhinliang@gmail.com
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this, "23qjaL381jmKJPAhNmEE3TFo-gzGzoHsz", "rnU4t4wqCeoyF8jbK8n7kuYY");
    }
}
