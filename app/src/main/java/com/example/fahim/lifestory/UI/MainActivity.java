package com.example.fahim.lifestory.UI;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.fahim.lifestory.R;
import com.example.fahim.lifestory.adapter.StoryItemAdapter;
import com.example.fahim.lifestory.model.DemoData;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private StoryItemAdapter adapter;

    private LinearLayoutManager mLinearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        adapter = new StoryItemAdapter(DemoData.getListData(), this);
        mRecyclerView.setAdapter(adapter);
    }
}
