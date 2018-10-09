package com.mshop.baseandroidapp.presentation;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by Miguelete on 9/10/18. Belongs to Alcampo App.
 * mShop Spain
 */
public class AndroidApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
//        AppInjector.init(this);
        super.onCreate();

    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
