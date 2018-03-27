package com.mills.b.joshua.dagger2demo.classes;

import android.widget.ImageView;

/**
 * Created by Inferno on 3/26/2018.
 */

public class Photo {
    private String url;
    private PhotoDownloader photoDownloader;

    public Photo(String url,PhotoDownloader photoDownloader) {
        this.url = url;
        this.photoDownloader = photoDownloader;
    }

    public void downloadImage(ImageView imageView){

        this.photoDownloader.getPhoto(imageView,url);
    }
}
