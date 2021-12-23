package com.talhahafeez.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Employees> employeesList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // RecyclerView list = (RecyclerView) findViewById(R.id.list);
        // list.setLayoutManager(new LinearLayoutManager(this));
        Employees f0 = new Employees(1,"James", R.drawable.d);
        Employees f1 = new Employees(2,"Leonardo", R.drawable.c);
        Employees f2 = new Employees(3,"Mario", R.drawable.b);
        Employees f3 = new Employees(4,"Martin",R.drawable.a);
        Employees f4 = new Employees(5,"Charles", R.drawable.c);
        Employees f5 = new Employees(6,"Oliver",R.drawable.a);
        Employees f6 = new Employees(7,"Emma", R.drawable.d);
        Employees f7 = new Employees(8,"Kate",R.drawable.b);
        Employees f8 = new Employees(8,"Elizebeth",R.drawable.c);
        Employees f9 = new Employees(8,"Rupenzel",R.drawable.d);
        Employees f10 = new Employees(8,"Iris",R.drawable.a);
        Employees f11 = new Employees(8,"Hamlet",R.drawable.b);

        employeesList.addAll(Arrays.asList(new Employees[]{f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11}));
        recyclerView = findViewById(R.id.list);

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        //  list = findViewById(R.id.list);
        adapter = new listAdapter(employeesList) ;
        recyclerView.setAdapter(adapter);
        //list.setHasFixedSize(true);
    }
}