package com.mills.b.joshua.dagger2demo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.mills.b.joshua.dagger2demo.classes.MyApp;
import com.mills.b.joshua.dagger2demo.classes.Photo;
import com.mills.b.joshua.dagger2demo.R;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , MainPhotoActivity.class);
                startActivity(intent);
            }
        });

        String photoURL = "https://farm1.staticflickr.com/873/26181252757_b48b14d936_b.jpg";


        photo.downloadImage((ImageView) findViewById(R.id.imageView), photoURL);
    }
}
