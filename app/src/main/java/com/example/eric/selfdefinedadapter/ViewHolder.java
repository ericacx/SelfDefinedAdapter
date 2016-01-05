package com.example.eric.selfdefinedadapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Eric on 15/12/31.
 */
public class ViewHolder {

    private View mConvertView;//用于返回给 listview adapter getView 方法的 view
    private SparseArray<View> viewSparseArray = new SparseArray<>();//推荐使用
    public View getmConvertView() {
        return mConvertView;
    }

    public ViewHolder(Context context,int resId) {
        mConvertView = LayoutInflater.from(context).inflate(resId,null);
        mConvertView.setTag(this);//给 view 设置 tag
    }

    public static ViewHolder getHolder(View convertView,Context context,int resId){
        ViewHolder viewHolder = null;
        if (convertView==null){
            viewHolder = new ViewHolder(context,resId);

        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return viewHolder;
    }
    public View findViewById(int id){
        View view = viewSparseArray.get(id);
        if (view != null) {
            return view;
        }else{
            view = mConvertView.findViewById(id);
            viewSparseArray.append(id,view);
        }
        return mConvertView.findViewById(id);
    }
}
