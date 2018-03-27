package com.mills.b.joshua.dagger2demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.mills.b.joshua.dagger2demo.R;
import com.mills.b.joshua.dagger2demo.classes.MyApp;
import com.mills.b.joshua.dagger2demo.classes.Photo;

import javax.inject.Inject;

public class MainPhotoActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_photo);

        String photoURL="https://farm1.staticflickr.com/894/39245236330_371a05cb00_b.jpg";
        String photoURL2 = "https://farm1.staticflickr.com/822/27182876298_eb30737698_b.jpg";
        String photoURL3 = "https://farm1.staticflickr.com/887/39245203170_5043cf3001_b.jpg";

        ((MyApp) getApplication()).getPhotoComponent().photo(this);

        photo.downloadImage((ImageView) findViewById(R.id.imageView2), photoURL);
        photo.downloadImage((ImageView) findViewById(R.id.imageView3), photoURL2);
        photo.downloadImage((ImageView) findViewById(R.id.imageView4), photoURL3);

    }
}
