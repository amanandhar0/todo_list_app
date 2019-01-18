package com.example.aman.todo_aman;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.aman.todo_aman.Dialog.AddFacelessDialog;
import com.example.aman.todo_aman.domain.faceless;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LinearLayoutManager LinearLayoutManager;
    private RecyclerviewAdapter recyclerviewAdapter;
    private ArrayList<faceless> facelessArrayList=new ArrayList<>();
    private View view;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();
        switch(id){
            case R.id.add_icon:
                view.setVisibility(View.VISIBLE);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,new AddFacelessDialog()).commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);//effects whole screen
        view=findViewById(R.id.main_view);

        LinearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        facelessArrayList=setData();

        recyclerviewAdapter=new RecyclerviewAdapter(this,facelessArrayList);
        recyclerView.setLayoutManager(LinearLayoutManager);
        recyclerView.setAdapter(recyclerviewAdapter);



    }
    public void setVisibility(){
        view.setVisibility(View.GONE);
    }

    private ArrayList<faceless>setData(){
        ArrayList<faceless>facelesses=new ArrayList<>();
        facelesses.add(new faceless("dancing","This is the memo ma" +
                "This is the memo made by facelsesde by facelses, This is the memo made by facelses" +
                ",This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelses," +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses","10:10"));

        facelesses.add(new faceless("dancing","This is the memo ma" +
                "This is the memo made by facelsesde by facelses, This is the memo made by facelses" +
                ",This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelses," +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses","10:10"));

        facelesses.add(new faceless("dancing","This is the memo ma" +
                "This is the memo made by facelsesde by facelses, This is the memo made by facelses" +
                ",This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelses," +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses","10:10"));

        facelesses.add(new faceless("dancing","This is the memo ma" +
                "This is the memo made by facelsesde by facelses, This is the memo made by facelses" +
                ",This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelses," +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses","10:10"));

        facelesses.add(new faceless("dancing","This is the memo ma" +
                "This is the memo made by facelsesde by facelses, This is the memo made by facelses" +
                ",This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelses," +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses","10:10"));

        facelesses.add(new faceless("dancing","This is the memo ma" +
                "This is the memo made by facelsesde by facelses, This is the memo made by facelses" +
                ",This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelses," +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses","10:10"));

        facelesses.add(new faceless("dancing","This is the memo ma" +
                "This is the memo made by facelsesde by facelses, This is the memo made by facelses" +
                ",This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelses," +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses","10:10"));

        facelesses.add(new faceless("dancing","This is the memo ma" +
                "This is the memo made by facelsesde by facelses, This is the memo made by facelses" +
                ",This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelses," +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses","10:10"));

        facelesses.add(new faceless("dancing","This is the memo ma" +
                "This is the memo made by facelsesde by facelses, This is the memo made by facelses" +
                ",This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelsesThis is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelsesThis is the memo made by facelses," +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses" +
                "This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses,This is the memo made by facelses","10:10"));
        return facelesses;
    }

}
