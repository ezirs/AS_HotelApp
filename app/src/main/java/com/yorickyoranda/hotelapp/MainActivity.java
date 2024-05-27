package com.yorickyoranda.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://th.bing.com/th/id/OIP.SXphjeuda2zmePhTvWv0MQHaE9?w=263&h=180&c=7&r=0&o=5&pid=1.7";
        Picasso.with(this).load(imageUrl).into(_imageView1);

    }
}