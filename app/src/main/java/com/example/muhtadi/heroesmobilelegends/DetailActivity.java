package com.example.muhtadi.heroesmobilelegends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle(getIntent().getStringExtra("name"));

        ImageView imageView = (ImageView)findViewById(R.id.img_detail_image);
        TextView tvName = (TextView)findViewById(R.id.tv_detail_name);
        TextView tvCategory = (TextView)findViewById(R.id.tv_detail_category);
        TextView tvStory = (TextView)findViewById(R.id.tv_detail_story);

        Glide.with(this).load(getIntent().getStringExtra("image")).into(imageView);
        tvName.setText(getIntent().getStringExtra("name"));
        tvCategory.setText(getIntent().getStringExtra("category"));
        tvStory.setText(getIntent().getStringExtra("story"));
    }
}
