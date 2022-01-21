package com.example.mvvm.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mvvm.LinearLayoutActivity;
import com.example.mvvm.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private Button mBtbLinear,btn_hor,mBtnGrid,mBtnPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mBtbLinear=findViewById(R.id.btn_linear);
        btn_hor = findViewById(R.id.btn_hor);
        mBtnGrid = findViewById(R.id.btn_grid);
        mBtnPu =findViewById(R.id.btn_pu);
        mBtbLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(RecyclerViewActivity.this,LinearRecylerViewActivity.class);
                startActivity(intent);
            }
        });

        btn_hor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(RecyclerViewActivity.this,HorRecylerViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(RecyclerViewActivity.this,GridRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(RecyclerViewActivity.this,PuRecyclerActivity.class);
                startActivity(intent);
            }
        });
    }
}