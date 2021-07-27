package com.example.ui_design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView mrecyclerview;
private List<String> title;
private  List<Integer> images;
private  MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecyclerview=findViewById(R.id.recycler_viev);


        title=new ArrayList<>();
        images=new ArrayList<>();

        adapter = new MyAdapter(this,title,images);

        images.add(R.drawable.science1);
        images.add(R.drawable.commerce);
        images.add(R.drawable.arts);
        images.add(R.drawable.design);
        images.add(R.drawable.maths1);
        images.add(R.drawable.architecture);
        images.add(R.drawable.web);
        images.add(R.drawable.android);
        images.add(R.drawable.java);
        images.add(R.drawable.science);


        title.add("Science");
        title.add("Commerce");
        title.add("Arts");
        title.add("Design");
        title.add("Maths");
        title.add("Architecture");
        title.add("Web Design");

        title.add("Android");
        title.add("Java");
        title.add("Biology");

        GridLayoutManager gridLayoutManager= new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        mrecyclerview.setLayoutManager(gridLayoutManager);
        mrecyclerview.setHasFixedSize(true);

        mrecyclerview.setAdapter(adapter);

    }
}
