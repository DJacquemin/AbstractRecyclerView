package com.example.student5306.abstracteverything;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.student5306.abstracteverything.adapters.ExempleViewHolder;
import com.example.student5306.abstracteverything.adapters.ListRecycleViewHolderAdapter;
import com.example.student5306.abstracteverything.models.Exemple;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---------------------------RECYCLER VIEW-----------------------------------
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        //---------------------------LAYOUT MANAGER----------------------------------
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //===============================ADAPTER======================================
        ListRecycleViewHolderAdapter<Exemple, ExempleViewHolder> adapter = new ListRecycleViewHolderAdapter(this, ExempleViewHolder.class);
        adapter.setViewHolderLayout(R.layout.row_exemple);

        //--------------------------------LIST---------------------------------------
        List<Exemple> exemples = new ArrayList<>();
        exemples.add(new Exemple("titre0", "message1"));
        exemples.add(new Exemple("titre1", "message2"));
        exemples.add(new Exemple("titre2", "message3"));
        exemples.add(new Exemple("titre3", "message4"));
        exemples.add(new Exemple("titre4", "message5"));
        exemples.add(new Exemple("titre5", "message6"));
        exemples.add(new Exemple("titre6", "message7"));
        adapter.setTList(exemples);


        recyclerView.setAdapter(adapter);
        //============================================================================

    }
}
