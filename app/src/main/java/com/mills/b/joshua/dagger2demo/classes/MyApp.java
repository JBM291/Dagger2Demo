package com.mills.b.joshua.dagger2demo.classes;

import android.app.Application;

import com.mills.b.joshua.dagger2demo.di.DaggerPhotoApplicationComponent;
import com.mills.b.joshua.dagger2demo.di.PhotoApplicationComponent;
import com.mills.b.joshua.dagger2demo.di.PhotoModule;

/**
 * Created by joshua on 03/27/2018.
 */

public class MyApp extends Application {
    PhotoApplicationComponent component;
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerPhotoApplicationComponent.builder()
                .photoModule(new PhotoModule("https://farm1.staticflickr.com/873/26181252757_b48b14d936_b.jpg"))
                .build();
    }
    public PhotoApplicationComponent getPhotoComponent() {
        return this.component;
    }
}
