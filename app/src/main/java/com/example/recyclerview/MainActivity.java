package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTeam;
    private ArrayList<ModelGunung> listTeam = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeam = findViewById(R.id.rv_team_list);
        rvTeam.setHasFixedSize(true);
        listTeam.addAll(DataGunung.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        AdapterGunung AdapterGunung = new AdapterGunung(this);
        AdapterGunung.setModelGunungs(listTeam);
        rvTeam.setAdapter(AdapterGunung);
    }
}