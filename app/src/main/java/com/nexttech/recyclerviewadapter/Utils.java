package com.nexttech.recyclerviewadapter;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Utils {

    public static void initRecyclerView(Context context, RecyclerView recyclerView, boolean setNestedScrollEnable) {


        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));


        ViewCompat.setNestedScrollingEnabled(recyclerView, setNestedScrollEnable);
        recyclerView.setFocusable(false);
    }

}
