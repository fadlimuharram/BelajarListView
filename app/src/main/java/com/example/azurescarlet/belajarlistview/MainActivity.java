package com.example.azurescarlet.belajarlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    protected ArrayList<DataBahasa> listpemrogramanarr = new ArrayList<DataBahasa>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listpemrogramanarr.add(new DataBahasa("c"));
        listpemrogramanarr.add(new DataBahasa("c++"));
        listpemrogramanarr.add(new DataBahasa("java"));
        listpemrogramanarr.add(new DataBahasa("php"));
        listpemrogramanarr.add(new DataBahasa("javascript"));
        listpemrogramanarr.add(new DataBahasa("python"));
        listpemrogramanarr.add(new DataBahasa("ruby"));

        MyAdapter adapternya = new MyAdapter(this, listpemrogramanarr);
        ListView mylistview = (ListView) findViewById(R.id.mylistview);
        mylistview.setAdapter(adapternya);

        Button btntambah = (Button) findViewById(R.id.btntambah);
        btntambah.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                tambahdata();
            }
        });

        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listpemrogramanarr.set(position,new DataBahasa("ABC"));
                String listdipilih = "Anda memilih " + Integer.toString(position);

                Toast.makeText(MainActivity.this, listdipilih, Toast.LENGTH_SHORT).show();
            }
        });
        /*
         EditText tmb = (EditText) findViewById(R.id.tambahedittext);
                listpemrogramanarr.add(tmb.toString());
                adapternya.notifyDataSetChanged();
         */
    }

    public void tambahdata(){
        EditText tmb = (EditText) findViewById(R.id.tambahedittext);
        ListView mylistview = (ListView) findViewById(R.id.mylistview);

        MyAdapter adapternya = new MyAdapter(this, listpemrogramanarr);
        listpemrogramanarr.add(new DataBahasa(tmb.getText().toString()));

        mylistview.setAdapter(adapternya);
        adapternya.notifyDataSetChanged();
    }

    public void tesklikaja(View V){
        Intent edtlayout = new Intent(this, ActivityEditBahasa.class);
        startActivity(edtlayout);
    }
}
