package com.nexttech.recyclerviewadapter.RvDataSet;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.nexttech.recyclerviewadapter.Objects.SampleObject1;
import com.nexttech.recyclerviewadapter.Objects.SampleObject2;
import com.nexttech.recyclerviewadapter.ViewHolders.SampleBviewHolder;


public class SampleBdataSet {

    private Context context;
    private SampleBviewHolder sampleAViewHolder;
    private SampleObject2 object;

    public SampleBdataSet(final Context context, SampleBviewHolder holderA, SampleObject2 object) {
        this.context = context;
        this.sampleAViewHolder = holderA;
        this.object = object;

        setSampleBData();
    }

    private void setSampleBData() {

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
