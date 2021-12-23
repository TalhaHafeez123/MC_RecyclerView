package com.talhahafeez.myapplication;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class listAdapter extends RecyclerView.Adapter <listAdapter.listViewHolder> {
    List<Employees> employeesList;


    public listAdapter(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_item_layout, parent, false);
        return new listViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull listAdapter.listViewHolder holder, int position) {

        holder.data = employeesList.get(position);
        holder.text.setText(holder.data.getName());
        holder.img.setImageResource(holder.data.getImageId());
    }

    @Override
    public int getItemCount() {

        return employeesList.size();
    }

    public class listViewHolder extends RecyclerView.ViewHolder {
        Employees data;
        ImageView img;
        TextView text;

        public listViewHolder(@NonNull View itemView) {

            super(itemView);
            img = itemView.findViewById(R.id.img);
            text = itemView.findViewById(R.id.name);
        }
    }
}
