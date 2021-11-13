package com.example.androidstudiodemofirebasetorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

//Git Developer Personal access tokens: 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
public class MainActivity extends AppCompatActivity {

    RecyclerView recView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recView = (RecyclerView) findViewById(R.id.recView);
        recView.setLayoutManager(new LinearLayoutManager(this));
    }
}