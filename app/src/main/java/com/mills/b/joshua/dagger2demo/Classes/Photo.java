package com.mills.b.joshua.dagger2demo.Classes;

import android.widget.ImageView;

import com.mills.b.joshua.dagger2demo.di.PhotoModule;

/**
 * Created by Inferno on 3/26/2018.
 */

public class Photo {
    private String url;
    private ImageView imageView;
    private PhotoDownloader photoDownloader;

    public Photo(String url, ImageView imageView,PhotoDownloader photoDownloader) {
        this.url = url;
        this.imageView = imageView;
        this.photoDownloader = photoDownloader;
    }

    public void downloadImage(){
        this.photoDownloader.getPhoto(imageView,url);
    }
}
