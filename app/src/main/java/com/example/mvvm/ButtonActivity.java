package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private TextView mTv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mTv1 = findViewById(R.id.lv_1);
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "我被点击了", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void showToast(View view){
        Toast.makeText(this, "我被点击了", Toast.LENGTH_SHORT).show();
    }

}