package com.mills.b.joshua.dagger2demo.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.mills.b.joshua.dagger2demo.classes.MyApp;
import com.mills.b.joshua.dagger2demo.classes.Photo;

import javax.inject.Inject;

/**
 * Created by joshua on 03/27/2018.
 */

public class BaseActivity extends AppCompatActivity {

    @Inject
    Photo photo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApp) getApplication()).getPhotoComponent().photo(this);
    }

}
