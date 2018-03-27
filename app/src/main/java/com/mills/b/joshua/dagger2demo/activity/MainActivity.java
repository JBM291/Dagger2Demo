package com.mills.b.joshua.dagger2demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.mills.b.joshua.dagger2demo.classes.MyApp;
import com.mills.b.joshua.dagger2demo.classes.Photo;
import com.mills.b.joshua.dagger2demo.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Photo photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        ((MyApp) getApplication()).getPhotoComponent().photo(this);

        photo.downloadImage((ImageView) findViewById(R.id.imageView));


    }
}
