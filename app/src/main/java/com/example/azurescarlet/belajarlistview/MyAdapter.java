package com.example.azurescarlet.belajarlistview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by azurescarlet on 7/5/17.
 */

public class MyAdapter extends ArrayAdapter<DataBahasa>{
    private ArrayList<DataBahasa> bhs;

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View theview = convertView;
        if (theview == null) {
            LayoutInflater theinflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            theview = theinflater.inflate(R.layout.row_layout,null);
        }

        DataBahasa dtbhs = bhs.get(position);

        if (dtbhs != null){
            TextView thetextview = (TextView) theview.findViewById(R.id.textviewprogramming);
            thetextview.setText(dtbhs.getbhs());

            ImageView theimg = (ImageView) theview.findViewById(R.id.imageviewprogramming);

            theimg.setImageResource(R.drawable.usricon);
        }

        return theview;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }


    public MyAdapter(Context context, ArrayList<DataBahasa>Values) {
        super(context,R.layout.row_layout, Values);
        this.bhs = Values;
    }



}
