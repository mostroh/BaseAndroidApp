package com.mshop.baseandroidapp.di.modules;

import android.app.Application;
import android.content.Context;

import com.mshop.baseandroidapp.presentation.AndroidApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Miguelete on 9/10/18. Belongs to Alcampo App.
 * mShop Spain
 */
@Module
public class AppModule {

    Application application;

    public AppModule(Application application) {
        this.application = application;
    }


    @Provides
    @Singleton
    public Application provideApplication(Application application) {
        return application;
    }

    @Provides
    @Singleton
    public AndroidApp provideApp(AndroidApp application) {
        return application;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return application.getApplicationContext();
    }

//    @Provides
//    @Singleton
//    BaseNavigation provideNavigator() {
//        return new BaseNavigation();
//    }
}
