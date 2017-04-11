
package com.acadgild.fujitsu.assignment4session1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fujitsu on 11/04/2017.
 */

public class Adapter extends BaseAdapter {


    private LayoutInflater mLayoutInflater;
    private ArrayList<String> dummyData;


    public Adapter() {
    }

    public Adapter(Context Contex, ArrayList<String> mDummydata) {

        dummyData = mDummydata;

        mLayoutInflater = LayoutInflater.from(Contex);
    }

    @Override
    public int getCount() {
        return dummyData.size();
    }

    @Override
    public Object getItem(int position) {
        return dummyData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String str = (String) getItem(position);

        convertView = mLayoutInflater.inflate(R.layout.orderlayout,parent,false);

        TextView Phone = (TextView) convertView.findViewById(R.id.order_text);
        Phone.setText(str);

        return convertView;



    }
}
