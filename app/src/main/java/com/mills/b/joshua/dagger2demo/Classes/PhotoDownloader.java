package com.mills.b.joshua.dagger2demo.Classes;

import android.widget.ImageView;

import com.mills.b.joshua.dagger2demo.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Inferno on 3/26/2018.
 */

public class PhotoDownloader {
    public boolean getPhoto(ImageView imageView, String url){

        Picasso.get().load(url)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.broken)
                .into(imageView);

        return true;
    }
}
