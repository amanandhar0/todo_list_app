package com.example.aman.todo_aman;

/**
 * Created by Aman on 02/01/2019.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerviewViewHolder extends RecyclerView.ViewHolder {
    public TextView headingTextView;
    public TextView detailTextView;
    public TextView timeTextView;
    public RecyclerviewViewHolder(View itemView){
        super(itemView);
        headingTextView=itemView.findViewById(R.id.heading);
       detailTextView=itemView.findViewById(R.id.detail);
        timeTextView=itemView.findViewById(R.id.time);
    }
}