package com.nexttech.recyclerviewadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.nexttech.recyclerviewadapter.Objects.SampleObject1;
import com.nexttech.recyclerviewadapter.Objects.SampleObject2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Object> arrayList = new ArrayList<>();
    RecyclerView recyclerView;
    CommonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        setData();
    }

    private void setData() {

        SampleObject1 sampleObject1 = new SampleObject1();
        sampleObject1.setText("Sample A");
        arrayList.add(sampleObject1);

        SampleObject2 sampleObject2 = new SampleObject2();
        sampleObject2.setText("Sample B");
        arrayList.add(sampleObject2);


        adapter.notifyDataSetChanged();

    }


    private void initUI() {
        recyclerView = findViewById(R.id.recyclerView);
        Utils.initRecyclerView(
                MainActivity.this
                , recyclerView
                , true);
        adapter = new CommonAdapter(this, arrayList);
        recyclerView.setAdapter(adapter);

    }

}
