package com.example.vikasrapaka.firebase;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PostDetailActivity extends AppCompatActivity {

    ImageView mImageIV;
    TextView mTitleTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Post Detail");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        mImageIV = findViewById(R.id.imageView);
        mTitleTv = findViewById(R.id.titleTv);
        //mDesc = findViewById(R.id.rDesc);

        byte [] bytes =getIntent().getByteArrayExtra("image");
        String title =getIntent().getStringExtra("title");
        //String desc =getIntent().getStringExtra("desc");


        Bitmap bmp = BitmapFactory.decodeByteArray(bytes,0,bytes.length);


        mTitleTv.setText(title);
        //mDesc.setText(desc);
        mImageIV.setImageBitmap(bmp);

    }

    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
