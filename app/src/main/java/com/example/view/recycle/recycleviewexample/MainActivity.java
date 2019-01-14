package com.example.view.recycle.recycleviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  cardItemClicked {
RecyclerView myrecycle;
RecyclerView.Adapter myadeptor;
RecyclerView.LayoutManager manager;
ArrayList<Persion> people;
Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        people = new ArrayList<Persion>();
        btnAdd = findViewById(R.id.btnAdd);
        myrecycle = (RecyclerView) findViewById(R.id.listToShow);
        myrecycle.setHasFixedSize(true);
        // manager=new LinearLayoutManager(this);
        //manager=new LinearLayoutManager(this,LinearLayout.HORIZONTAL,false);
        //manager=new GridLayoutManager(this,2,GridLayout.HORIZONTAL,false);
        manager = new GridLayoutManager(this, 2, GridLayout.VERTICAL, false);
        myrecycle.setLayoutManager(manager);
        people.add(new Persion("rahul", "singh", "bluestar"));
        people.add(new Persion("manish", "singh", "redstar"));
        people.add(new Persion("nitin", "raj", "bluestar"));
        people.add(new Persion("joya", "singh", "bluestar"));
        people.add(new Persion("subham", "mishra", "redstar"));
        people.add(new Persion("payal", "tyagi", "bluestar"));
        people.add(new Persion("priti", "ray", "bluestar"));
        people.add(new Persion("anjali", "yadav", "redstar"));
        people.add(new Persion("manish", "singh", "redstar"));
        people.add(new Persion("nitin", "raj", "bluestar"));
        people.add(new Persion("joya", "singh", "bluestar"));
        people.add(new Persion("subham", "mishra", "redstar"));
        people.add(new Persion("payal", "tyagi", "bluestar"));
        people.add(new Persion("priti", "ray", "bluestar"));
        people.add(new Persion("anjali", "yadav", "redstar"));
        myadeptor = new persionAdepter(this, people);
        myrecycle.setAdapter(myadeptor);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people.add(new Persion("banti", "singh", "redstar"));
                myadeptor.notifyDataSetChanged();
            }


        });
    }

    @Override
    public void onCardItemClicked(int i) {
        Toast.makeText(MainActivity.this,"surname "+people.get(i).getsurname(),Toast.LENGTH_SHORT).show();
    }
}
