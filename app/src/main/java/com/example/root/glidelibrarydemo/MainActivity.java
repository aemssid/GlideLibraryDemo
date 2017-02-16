package com.example.root.glidelibrarydemo;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imageUrl="https://media.giphy.com/media/OdTiHQqTFaO1q/giphy.gif";
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        Glide.with(this).load(imageUrl).asGif()
                .placeholder(R.drawable.picture)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }
}
