package com.ahiralabata.ahiralistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lvItem;
    String[] namanegara = {"Indonesia", "Malaysia", "Brunei", "Singapore", "Thailand", " Philippine", "Vietnam", "Laos", "Myanmar", "Kamboja" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String >(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Memilih : " + namanegara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}