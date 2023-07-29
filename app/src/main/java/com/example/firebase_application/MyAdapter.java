package com.example.firebase_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.Myviewholder> {
    @NonNull

    Context context;
    ArrayList<User> userArrayList;

    public MyAdapter(@NonNull Context context, ArrayList<User> userArrayList){
        this.context = context;
        this.userArrayList = userArrayList;
    }


    @NonNull
    public MyAdapter.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new Myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.Myviewholder holder, int position) {
        User user = userArrayList.get(position);
        holder.Name.setText(user.name);
        holder.roll.setText(user.roll_number);
        holder.email.setText(user.email);

    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder {
        TextView Name,roll,email;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.name);
            roll = itemView.findViewById(R.id.roll);
            email = itemView.findViewById(R.id.email);

        }
    }
}
