package com.example.azurescarlet.belajarlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] listpemrograman ={"c","c++","java","php","javascript","python","ruby"};

        ListAdapter adapternya = new MyAdapter(this, listpemrograman);


        ListView mylistview = (ListView) findViewById(R.id.mylistview);

        mylistview.setAdapter(adapternya);

        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String listdipilih = "Anda memilih " + String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, listdipilih, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
