package com.mshop.baseandroidapp.di.modules.network;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.mshop.baseandroidapp.BuildConfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Miguelete on 9/10/18. Belongs to Alcampo App.
 * mShop Spain
 */
@Module
public class RetrofitModule {

//    @Provides
//    @Singleton
//    CryptoService getApiInterface(Retrofit retroFit) {
//        return retroFit.create(CryptoService.class);
//    }

    @Provides
    @Singleton
    Retrofit getRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BuildConfig.API_ENDPOINT_LOCAL)
                    .client(okHttpClient)
                    .build();
    }

    @Provides
    @Singleton
    OkHttpClient getOkHttpCleint(HttpLoggingInterceptor httpLoggingInterceptor) {
        return new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();
    }

}