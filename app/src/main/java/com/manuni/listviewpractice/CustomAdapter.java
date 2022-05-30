package com.manuni.listviewpractice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
     Context context;
     String[] birianiNames;
     String[] subNames;
     int[] birianiPic;
    public CustomAdapter(Context context,String[] birianiNames, String[] subNames, int[] birianiPic){
        this.context = context;
        this.birianiNames = birianiNames;
        this.subNames = subNames;
        this.birianiPic = birianiPic;
    }

    @Override
    public int getCount() {
        return birianiNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             view =  inflater.inflate(R.layout.item_layout,viewGroup,false);

        }
       ImageView birianiImage = view.findViewById(R.id.imageViewId);
        TextView myBirianiNames = view.findViewById(R.id.birianiNameId);
        TextView birianiSubNames = view.findViewById(R.id.birianiSubNameId);

        try {
            birianiImage.setImageResource(birianiPic[i]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            myBirianiNames.setText(birianiNames[i]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            birianiSubNames.setText(subNames[i]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }
}
