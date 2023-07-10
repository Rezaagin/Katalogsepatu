package com.example.sepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BrandNike extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike);

        listView = (ListView) findViewById(R.id.list);
        try {
            String[] values = new String[]{"Nike Blazer Mid 77", "Nike E-Series 1.0 ", "Nike Kiger 9", "Nike Phantom GX Club TF"

            };

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, values);

            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    if (position == 0) {
                        Toast.makeText(getApplicationContext(), "Memasuki Pilihan Anda",
                                Toast.LENGTH_SHORT).show();
                        Intent myIntent = new Intent(view.getContext(), Nike1.class);
                        startActivityForResult(myIntent, 0);
                    }

                    if (position == 1) {
                        Toast.makeText(getApplicationContext(), "Memasuki Pilihan Anda",
                                Toast.LENGTH_SHORT).show();
                        Intent myIntent = new Intent(view.getContext(), Nike2.class);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 2) {
                        Toast.makeText(getApplicationContext(), "Memasuki Pilihan Anda",
                                Toast.LENGTH_SHORT).show();
                        Intent myIntent = new Intent(view.getContext(), Nike3.class);
                        startActivityForResult(myIntent, 0);
                    }
                    if (position == 3) {
                        Toast.makeText(getApplicationContext(), "Memasuki Pilihan Anda",
                                Toast.LENGTH_SHORT).show();
                        Intent myIntent = new Intent(view.getContext(), Nike4.class);
                        startActivityForResult(myIntent, 0);
                    }


                }
            });
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Pilihan Anda Tidak Ada",
                    Toast.LENGTH_SHORT).show();
        }}
}