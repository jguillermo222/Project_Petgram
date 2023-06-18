package com.example.actsemana3coursera;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;


    public Adapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageResource(items.get(position).getImage());
        holder.imageView2.setImageResource(items.get(position).getImageHueso());
        holder.textView.setText(items.get(position).getText());
        holder.textView2.setText(items.get(position).getText2());
        holder.imageView3.setImageResource(items.get(position).getImagenHuesoDorado());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }



}
