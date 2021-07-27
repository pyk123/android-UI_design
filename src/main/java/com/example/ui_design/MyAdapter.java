package com.example.ui_design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {

    private Context context;
    private List<String> title;
    private List<Integer> images;


    public MyAdapter( Context context,List<String> title,List<Integer> images)
    {
    this.context=context;
    this.title=title;
    this.images=images;

    }

    @NonNull

    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.grid_items,parent,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull  MyAdapter.myViewHolder holder, int position) {
        holder.text_view.setText(title.get(position));
        holder.image_view.setImageResource(images.get(position));

    }

    @Override
    public int getItemCount() {
        return title.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{
     ImageView  image_view;
     TextView text_view;

        public myViewHolder(@NonNull  View itemView) {
            super(itemView);
            image_view=itemView.findViewById(R.id.image_view);
            text_view=itemView.findViewById(R.id.text_view);
        }
    }
}
