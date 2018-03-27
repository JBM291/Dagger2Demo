package com.mills.b.joshua.dagger2demo.di;

import com.mills.b.joshua.dagger2demo.classes.Photo;
import com.mills.b.joshua.dagger2demo.classes.PhotoDownloader;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Inferno on 3/26/2018.
 */
@Module
public class PhotoModule {

    public PhotoModule() {

    }

    @Provides
    Photo providePhoto(PhotoDownloader photoDownloader){

        return new Photo(photoDownloader);
    }

    @Provides
    @Singleton
    PhotoDownloader providesPhotoDownloader(){

        return new PhotoDownloader();
    }
}
