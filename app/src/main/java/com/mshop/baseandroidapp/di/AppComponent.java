package com.mshop.baseandroidapp.di;

import com.mshop.baseandroidapp.di.modules.AppModule;
import com.mshop.baseandroidapp.di.modules.network.GsonModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Miguelete on 9/10/18. Belongs to Alcampo App.
 * mShop Spain
 */
@Singleton
@Component(modules = {
        AppModule.class,
        GsonModule.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        AppComponent build();

        Builder appModule(AppModule appModule);
        Builder gsonModule(GsonModule gsonModule);
//        Builder androidModule(AndroidModule androidModule);
    }
}
