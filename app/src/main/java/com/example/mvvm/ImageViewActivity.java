package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView miv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        miv4 = findViewById(R.id.iv_4);
        Glide.with(this)
                .load("https://th.bing.com/th/id/OIP.cHKzWpwo4htVEgDOL2gidgHaEK?pid=ImgDet&rs=1")
                .into(miv4);

    }
}