package com.example.view.recycle.recycleviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView myrecycle;
RecyclerView.Adapter myadeptor;
RecyclerView.LayoutManager manager;
ArrayList<Persion> people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        people= new ArrayList<Persion>();
        myrecycle=(RecyclerView) findViewById(R.id.listToShow);
        myrecycle.setHasFixedSize(true);
        manager=new LinearLayoutManager(this);
        myrecycle.setLayoutManager(manager);
        people.add(new Persion("rahul","singh","bluestar"));
        people.add(new Persion("manish","singh","redstar"));
        people.add(new Persion("nitin","raj","bluestar"));
        people.add(new Persion("joya","singh","bluestar"));
        people.add(new Persion("subham","mishra","redstar"));
        people.add(new Persion("payal","tyagi","bluestar"));
        people.add(new Persion("priti","ray","bluestar"));
        people.add(new Persion("anjali","yadav","redstar"));
        myadeptor=new persionAdepter(this,people);
        myrecycle.setAdapter(myadeptor);

    }
}
