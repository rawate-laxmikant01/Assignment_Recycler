package com.example.assignment;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.viewholder> {

    ArrayList<Model> list;
    Context context;

    public RecyclerAdapter(ArrayList<Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public viewholder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull RecyclerAdapter.viewholder holder, int position) {

        holder.custom_name.setText(list.get(position).getName());
        holder.custom_date.setText(list.get(position).getDate());
        holder.custom_company.setText(list.get(position).getCompany());
        holder.custom_address.setText(list.get(position).getAddress());
        holder.custom_des.setText(list.get(position).getDescription());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        TextView custom_name,custom_date,custom_company,custom_des,custom_address;

        public viewholder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            custom_name=itemView.findViewById(R.id.name);
            custom_date=itemView.findViewById(R.id.date);
            custom_company=itemView.findViewById(R.id.company);
            custom_des=itemView.findViewById(R.id.description);
            custom_address=itemView.findViewById(R.id.address);


        }
    }
}
