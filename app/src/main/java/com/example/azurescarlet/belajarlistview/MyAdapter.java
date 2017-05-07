package com.example.azurescarlet.belajarlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by azurescarlet on 7/5/17.
 */

public class MyAdapter extends ArrayAdapter<String> {


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theinflater = LayoutInflater.from(getContext());

        View theview = theinflater.inflate(R.layout.row_layout,parent,false);

        String listpemrograman = getItem(position);

        TextView thetextview = (TextView) theview.findViewById(R.id.textviewprogramming);

        thetextview.setText(listpemrograman);

        ImageView theimg = (ImageView) theview.findViewById(R.id.imageviewprogramming);

        theimg.setImageResource(R.drawable.usricon);

        return theview;
    }

    public MyAdapter(Context context, String[] Values) {
        super(context,R.layout.row_layout, Values);
    }

}
