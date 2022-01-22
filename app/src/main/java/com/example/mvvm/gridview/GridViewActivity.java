package com.example.mvvm.gridview;

import androidx.appcompat.app.AppCompatActivity;
import com.example.mvvm.R;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {

    private GridView mGv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        mGv = findViewById(R.id.gv);
        mGv.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
        mGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridViewActivity.this, "点击pos"+i, Toast.LENGTH_SHORT).show();
            }
        });

    }
}