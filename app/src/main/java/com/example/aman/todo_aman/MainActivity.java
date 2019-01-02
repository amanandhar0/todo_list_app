package com.example.aman.todo_aman;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.aman.todo_aman.domain.faceless;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LinearLayoutManager LinearLayoutManager;
    private RecyclerviewAdapter recyclerviewAdapter;
    private ArrayList<faceless> facelessArrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);

        LinearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        facelessArrayList=setData();

        recyclerviewAdapter=new RecyclerviewAdapter(this,facelessArrayList);
        recyclerView.setLayoutManager(LinearLayoutManager);
        recyclerView.setAdapter(recyclerviewAdapter);



    }
    private ArrayList<faceless>setData(){
        ArrayList<faceless>facelesses=new ArrayList<>();
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        facelesses.add(new faceless("dancing","PRactise for farewell program","10:10"));
        return facelesses;
    }
}
