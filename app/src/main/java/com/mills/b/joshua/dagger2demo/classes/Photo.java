package com.mills.b.joshua.dagger2demo.classes;

import android.widget.ImageView;

/**
 * Created by Inferno on 3/26/2018.
 */

public class Photo {
    private PhotoDownloader photoDownloader;

    public Photo(PhotoDownloader photoDownloader) {
        this.photoDownloader = photoDownloader;
    }

    public void downloadImage(ImageView imageView,String url){
        this.photoDownloader.getPhoto(imageView,url);
    }
}
