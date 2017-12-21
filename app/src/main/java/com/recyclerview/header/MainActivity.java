package com.recyclerview.header;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.rcv_header)
    RecyclerView addHeaderRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        addHeaderRecyclerView.setLayoutManager(linearLayoutManager);
        addHeaderRecyclerView.setHasFixedSize(true);
        CustomRecyclerViewAdapter customAdapter = new CustomRecyclerViewAdapter(getDataSource());
        addHeaderRecyclerView.setAdapter(customAdapter);
    }

    private List<ItemObject> getDataSource() {
        List<ItemObject> data = new ArrayList<>();
        data.add(new ItemObject("First Header"));
        data.add(new ItemObject("This is the item content in the first position"));
        data.add(new ItemObject("This is the item content in the second position"));
        data.add(new ItemObject("This is the item content in the third position"));
        data.add(new ItemObject("This is the item content in the fourth position"));
        data.add(new ItemObject("This is the item content in the fifth position"));
        data.add(new ItemObject("This is the item content in the first position"));
        data.add(new ItemObject("This is the item content in the second position"));
        data.add(new ItemObject("This is the item content in the third position"));
        data.add(new ItemObject("This is the item content in the fourth position"));
        data.add(new ItemObject("Two Header"));
        data.add(new ItemObject("This is the item content in the fourth position"));
        data.add(new ItemObject("This is the item content in the fifth position"));
        data.add(new ItemObject("This is the item content in the first position"));
        data.add(new ItemObject("This is the item content in the second position"));
        data.add(new ItemObject("This is the item content in the third position"));
        data.add(new ItemObject("This is the item content in the fourth position"));
        return data;
    }
}
