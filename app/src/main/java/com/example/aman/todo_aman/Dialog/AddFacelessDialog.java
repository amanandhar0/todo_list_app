package com.example.aman.todo_aman.Dialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.aman.todo_aman.MainActivity;
import com.example.aman.todo_aman.R;

import java.util.Calendar;

/**
 * Created by Aman on 09/01/2019.
 */

public class AddFacelessDialog extends DialogFragment implements View.OnClickListener{

    TextInputLayout heading_dialog,detail_dialog,dateEditText;
    Button save,cancel;
    Calendar calender;

    public AddFacelessDialog() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add_faceless_dialog_activity, container, false);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        heading_dialog=view.findViewById(R.id.heading_editext);
        detail_dialog=view.findViewById(R.id.detial_editext);
//        dateEditText=view.findViewById(R.id.dateEdittexr);
        save=view.findViewById(R.id.save);
        cancel=view.findViewById(R.id.cancel);
//        date_imageview=view.findViewById(R.id.date_imageview);
        save.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }


    public void onClick(View v){
        int id=v.getId();

        switch (id){
            case R.id.save:
                Toast.makeText(getActivity(), "Clicked save", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cancel:
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.setVisibility();
                this.dismiss();
                break;



        }
    }
}
