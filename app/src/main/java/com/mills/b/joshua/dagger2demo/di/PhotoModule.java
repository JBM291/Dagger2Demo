package com.mills.b.joshua.dagger2demo.di;

import android.widget.ImageView;

import com.mills.b.joshua.dagger2demo.Classes.Photo;
import com.mills.b.joshua.dagger2demo.Classes.PhotoDownloader;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Inferno on 3/26/2018.
 */
@Module
public class PhotoModule {
    private String url;
    private ImageView imageView;

    public PhotoModule(String url, ImageView imageView) {
        this.url = url;
        this.imageView = imageView;
    }

    Photo provides(PhotoDownloader photoDownloader){
        return new Photo(url,imageView, photoDownloader);
    }

    @Provides
    @Singleton
    PhotoDownloader providesPhotoDownloader(){
        return new PhotoDownloader();
    }
}
