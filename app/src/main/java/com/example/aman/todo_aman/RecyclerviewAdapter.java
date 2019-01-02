package com.example.aman.todo_aman;

/**
 * Created by Aman on 02/01/2019.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aman.todo_aman.domain.faceless;

import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewViewHolder>{

    private Context context;
    private ArrayList<faceless> facelessArrayList;

    public RecyclerviewAdapter(Context context,ArrayList<faceless> facelessArrayList){
        this.context=context;
        this.facelessArrayList=facelessArrayList;
    }

    @NonNull
    @Override
    public RecyclerviewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_row_design,viewGroup,false);
        return new RecyclerviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewViewHolder recyclerviewViewHolder, int i) {

        recyclerviewViewHolder.headingTextView.setText(facelessArrayList.get(i).getHeading());
        recyclerviewViewHolder.detailTextView.setText(facelessArrayList.get(i).getDetail());
        recyclerviewViewHolder.timeTextView.setText(facelessArrayList.get(i).getTime());

    }

    @Override
    public int getItemCount() {
        return facelessArrayList.size();
    }
}

