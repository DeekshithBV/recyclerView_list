package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList courseName = new ArrayList<>(Arrays.asList("Data Structures","Android", "Web dev", "Java","C++", "Python", "DBMS",
            "computer graphics","System software","DAA","Kotlin","oops","ML","Artificial intelligence","ADE","DAA","C#","Ruby",
            "ShellScript"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        Adapter adapter = new Adapter(this, courseName);
        recyclerView.setAdapter(adapter);
    }
}