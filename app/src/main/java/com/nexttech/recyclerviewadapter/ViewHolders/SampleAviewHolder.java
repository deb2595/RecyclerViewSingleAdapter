package com.nexttech.recyclerviewadapter.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.nexttech.recyclerviewadapter.R;

public class SampleAviewHolder extends RecyclerView.ViewHolder {

    public TextView textView;

    public SampleAviewHolder(View itemView) {
        super(itemView);
        this.textView = itemView.findViewById(R.id.tvSamplea);
    }
}
