package com.mills.b.joshua.dagger2demo.di;

import com.mills.b.joshua.dagger2demo.Classes.Photo;
import com.mills.b.joshua.dagger2demo.Classes.PhotoDownloader;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Inferno on 3/26/2018.
 */

@Singleton
@Component(modules = PhotoModule.class)
public interface PhotoApplicationComponent {
    Photo photo();
    PhotoDownloader PhotoDownloader();
}
