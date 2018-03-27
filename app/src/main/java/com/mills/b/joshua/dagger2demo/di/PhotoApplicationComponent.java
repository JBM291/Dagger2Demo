package com.mills.b.joshua.dagger2demo.di;

import com.mills.b.joshua.dagger2demo.activity.BaseActivity;
import com.mills.b.joshua.dagger2demo.activity.MainActivity;
import com.mills.b.joshua.dagger2demo.classes.Photo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Inferno on 3/26/2018.
 */

@Singleton
@Component(modules = PhotoModule.class)
public interface PhotoApplicationComponent {
    void photo(BaseActivity activity);
}
