package com.example.eric.selfdefinedadapter;

import android.content.Context;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Eric on 15/12/31.
 */
public class MyAdapter extends MyBaseAdapter<String>{

    private List<String> strings;
    public MyAdapter(List<String> list, int resId, Context context) {
        super(list, resId, context);
        this.strings = strings;//数据源赋值
    }

    @Override
    public void setData(ViewHolder viewHolder, int position) {
        ((TextView) viewHolder.findViewById(R.id.tv)).setText("这是第"+position+"条");
    }
}
