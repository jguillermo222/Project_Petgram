package com.example.actsemana3coursera;


import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {


    ImageView imageView;
    ImageView imageView2;
    TextView textView;
    TextView textView2;
    ImageView imageView3;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imagen1);
        imageView2 = itemView.findViewById(R.id.imagen2);
        textView = itemView.findViewById(R.id.texto1);
        textView2 = itemView.findViewById(R.id.texto2);
        imageView3 = itemView.findViewById(R.id.imagen3);


    }
}
