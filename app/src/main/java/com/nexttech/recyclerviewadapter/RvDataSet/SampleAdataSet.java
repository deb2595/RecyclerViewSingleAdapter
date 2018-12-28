package com.nexttech.recyclerviewadapter.RvDataSet;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.nexttech.recyclerviewadapter.Objects.SampleObject1;
import com.nexttech.recyclerviewadapter.ViewHolders.SampleAviewHolder;


public class SampleAdataSet {

    private Context context;
    private SampleAviewHolder sampleAViewHolder;
    private SampleObject1 object;

    public SampleAdataSet(final Context context, SampleAviewHolder holderA, SampleObject1 object) {
        this.context = context;
        this.sampleAViewHolder = holderA;
        this.object = object;

        setSampleAData();
    }

    private void setSampleAData() {

        try {
            sampleAViewHolder.textView.setText(object.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            sampleAViewHolder.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
