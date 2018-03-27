package com.mills.b.joshua.dagger2demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.mills.b.joshua.dagger2demo.Classes.Photo;
import com.mills.b.joshua.dagger2demo.Classes.PhotoDownloader;
import com.mills.b.joshua.dagger2demo.R;
import com.mills.b.joshua.dagger2demo.di.DaggerPhotoApplicationComponent;
import com.mills.b.joshua.dagger2demo.di.PhotoApplicationComponent;
import com.mills.b.joshua.dagger2demo.di.PhotoModule;

import dagger.android.DaggerApplication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhotoApplicationComponent component = DaggerPhotoApplicationComponent.builder()
                .photoModule(new PhotoModule("",(ImageView) findViewById(R.id.imageView))).build();

        Photo photo = component.photo();
    }
}
