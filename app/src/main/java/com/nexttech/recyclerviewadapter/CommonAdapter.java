package com.nexttech.recyclerviewadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nexttech.recyclerviewadapter.Objects.SampleObject1;
import com.nexttech.recyclerviewadapter.Objects.SampleObject2;
import com.nexttech.recyclerviewadapter.RvDataSet.SampleAdataSet;
import com.nexttech.recyclerviewadapter.RvDataSet.SampleBdataSet;
import com.nexttech.recyclerviewadapter.ViewHolders.SampleAviewHolder;
import com.nexttech.recyclerviewadapter.ViewHolders.SampleBviewHolder;

import java.util.ArrayList;


public class CommonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int SAMPLE_OBJECT_A = 0;
    private static final int SAMPLE_OBJECT_B = 1;
    private ArrayList<Object> arrayList;
    private Context context;


    public CommonAdapter(Context context, ArrayList<Object> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate_home_adp, parent, false);

        LayoutInflater inflater = LayoutInflater.from(context);
        if (viewType == SAMPLE_OBJECT_A) {
            View sampleAView = inflater.inflate(R.layout.inflate_sample_a, parent, false);
            return new SampleAviewHolder(sampleAView);
        } else if (viewType == SAMPLE_OBJECT_B) {
            View sampleBView = inflater.inflate(R.layout.inflate_sample_b, parent, false);
            return new SampleBviewHolder(sampleBView);
        } else {
            return null;
        }
        // return new SampleBviewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {


        if (holder instanceof SampleBviewHolder) {

            SampleObject2 sampleObject2 = (SampleObject2) arrayList.get(position);
            new SampleBdataSet(context, (SampleBviewHolder) holder, sampleObject2);


        } else if (holder instanceof SampleAviewHolder) {

            SampleObject1 sampleObject1 = (SampleObject1) arrayList.get(position);
            new SampleAdataSet(context, (SampleAviewHolder) holder, sampleObject1);

        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        Object item = arrayList.get(position);
        if (item instanceof SampleObject1) {
            return SAMPLE_OBJECT_A;
        } else if (item instanceof SampleObject2) {
            return SAMPLE_OBJECT_B;
        } else {
            return -1;
        }
    }


}