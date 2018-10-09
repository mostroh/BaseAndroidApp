package com.mshop.baseandroidapp.di.modules.network;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.text.DateFormat;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Miguelete on 9/10/18. Belongs to Alcampo App.
 * mShop Spain
 */
@Module
public class GsonModule {

    @Provides
    @Singleton
    public GsonBuilder provideDefaultGsonBuilder() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        gsonBuilder.setDateFormat(DateFormat.FULL);
        return gsonBuilder;
    }

    @Provides
    @Singleton
    Gson provideGson(GsonBuilder gsonBuilder) {
        return gsonBuilder.create();
    }
}
