package com.example.mvvm.recycleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm.R;

public class StaggeredGridAdapter extends RecyclerView.Adapter<StaggeredGridAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener listener;
//    private List<String>  list;
    public StaggeredGridAdapter(Context context, OnItemClickListener listener){
        this.mContext = context;
        this.listener =listener;
    }
    @NonNull
    @Override
    public StaggeredGridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_stafferedgrid_recyclerview_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredGridAdapter.LinearViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        if (position %2!=0) {
            holder.imageView.setImageResource(R.drawable.ic_001);
        }else {
            holder.imageView.setImageResource(R.drawable.ic_002);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                listener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 80;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv);
        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
