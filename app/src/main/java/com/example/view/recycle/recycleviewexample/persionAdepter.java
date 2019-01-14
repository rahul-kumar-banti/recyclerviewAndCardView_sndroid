package com.example.view.recycle.recycleviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

interface cardItemClicked
{
    public void onCardItemClicked(int i);
}
public class persionAdepter extends RecyclerView.Adapter<persionAdepter.Viewholder> {
    ArrayList<Persion> people;
cardItemClicked activity;

    public persionAdepter(Context context, ArrayList<Persion> people) {
        this.people = people;
        activity=(cardItemClicked)context;
    }
    public class Viewholder extends RecyclerView.ViewHolder {
        TextView tvName,tvSurname;
        ImageView imgPref;
        public Viewholder(@NonNull final View itemView) {
            super(itemView);
          tvName=itemView.findViewById(R.id.tvName);
          tvSurname=itemView.findViewById(R.id.tvSurname);
          imgPref=itemView.findViewById(R.id.imgPref);
          itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
activity.onCardItemClicked(people.indexOf(v.getTag()));
              }
          });
        }
    }

    @NonNull
    @Override
    public persionAdepter.Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items,viewGroup,false);

        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull persionAdepter.Viewholder viewHolder, int i) {
        Log.d("length:","name_is:"+people.get(i).getName()+"\n");
  viewHolder.itemView.setTag(people.get(i));
  viewHolder.tvName.setText(people.get(i).getName().toString());
        viewHolder.tvSurname.setText(people.get(i).getsurname().toString());
        if(people.get(i).getPref().equals("redstar"))
        viewHolder.imgPref.setImageResource(R.drawable.redstar);
        else
            viewHolder.imgPref.setImageResource(R.drawable.bluestar);


    }

    @Override
    public int getItemCount() {
        Log.d("length:","total length is"+people.size());
        return people.size();
    }
}

