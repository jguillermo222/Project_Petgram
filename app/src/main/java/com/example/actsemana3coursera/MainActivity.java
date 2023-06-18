package com.example.actsemana3coursera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






















    RecyclerView recyclerView = findViewById(R.id.reciclerView);


        List<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.perro10, R.drawable.hueso1,"Lucas", "5",R.drawable.perrooo));
        items.add(new Item(R.drawable.perro11, R.drawable.hueso1,"Nala", "5",R.drawable.perrooo));
        items.add(new Item(R.drawable.perro12, R.drawable.hueso1,"Funji", "5",R.drawable.perrooo));
        items.add(new Item(R.drawable.perro13, R.drawable.hueso1,"Lelo", "5",R.drawable.perrooo));
        items.add(new Item(R.drawable.perro14, R.drawable.hueso1,"Luna", "5",R.drawable.perrooo));
        items.add(new Item(R.drawable.perro21, R.drawable.hueso1,"Zen", "5",R.drawable.perrooo));
        items.add(new Item(R.drawable.perro22, R.drawable.hueso1,"Mojito", "5",R.drawable.perrooo));
        items.add(new Item(R.drawable.perro23, R.drawable.hueso1,"Milo", "5",R.drawable.perrooo));
        items.add(new Item(R.drawable.perro24, R.drawable.hueso1,"Vader", "5",R.drawable.perrooo));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),items));

    }

    //parte 2

    public void irAPagina2 (View v){
        Intent intent = new Intent(this, Pagina2.class);
        startActivity(intent);
    }


}