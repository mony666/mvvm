package com.example.mvvm.recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvvm.R;

public class PuRecyclerActivity extends AppCompatActivity {

    private RecyclerView  mRvPu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_recycler);
        mRvPu = findViewById(R.id.rv_pu);
        mRvPu.addItemDecoration(new MyDecoration());
        mRvPu.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mRvPu.setAdapter(new StaggeredGridAdapter(PuRecyclerActivity.this, new StaggeredGridAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(PuRecyclerActivity.this, "click"+pos, Toast.LENGTH_SHORT).show();
            }
        }));
    }
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap =getResources().getDimensionPixelSize(R.dimen.dividerHegoht2);
            outRect.set(gap,gap,gap,gap);
        }
    }
}