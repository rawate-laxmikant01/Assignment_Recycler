package com.example.assignment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Model> arrayList = new ArrayList<>();
    ;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);


//        arrayList.get(0).setName("Laxmikant");
//        arrayList.get(0).setDate("20-sep-2021");
//        arrayList.get(0).setCompany("Felix Techlabs");
//        arrayList.get(0).setDescription("Android Developer");
//        arrayList.get(0).setAddress("Viman nager ,pune");
//


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        for(int i=0 ;i<=arrayList.size();i++){
        Model m = new Model("Laxmikant", "20-sep-2021", "Felix", "Android Development", "pune");
        Model m1 = new Model("Sam", "20-sep-2021", "Felix", "Android Development", "pune");
        Model m2 = new Model("Ram", "20-sep-2021", "Felix", "Android Development", "pune");
        Model m3 = new Model("xyz", "20-sep-2021", "Felix", "Android Development", "pune");
        Model m4 = new Model("raj", "20-sep-2021", "Felix", "Android Development", "pune");
        arrayList.add(m);
        arrayList.add(m1);
        arrayList.add(m2);
        arrayList.add(m3);
        arrayList.add(m4);
//        }

        recyclerAdapter = new RecyclerAdapter(arrayList, MainActivity.this);
        recyclerView.setAdapter(recyclerAdapter);

    }
}