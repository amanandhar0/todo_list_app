package com.example.aman.todo_aman;

/**
 * Created by Aman on 02/01/2019.
 */

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

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
    public void onBindViewHolder(@NonNull final RecyclerviewViewHolder recyclerviewViewHolder, int i) {

        recyclerviewViewHolder.headingTextView.setText(facelessArrayList.get(i).getHeading());
        recyclerviewViewHolder.detailTextView.setText(facelessArrayList.get(i).getDetail());
        recyclerviewViewHolder.timeTextView.setText(facelessArrayList.get(i).getTime());
        recyclerviewViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(context, "This is recycler toasts", Toast.LENGTH_SHORT).show();

                String heading=recyclerviewViewHolder.headingTextView.getText().toString();
                String detail=recyclerviewViewHolder.detailTextView.getText().toString();
                String time=recyclerviewViewHolder.timeTextView.getText().toString();

                Intent i =new Intent(context,DetailActivity.class);
                i.putExtra("heading",heading);
                i.putExtra("detail",detail);
                i.putExtra("time",time);
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return facelessArrayList.size();
    }
}

