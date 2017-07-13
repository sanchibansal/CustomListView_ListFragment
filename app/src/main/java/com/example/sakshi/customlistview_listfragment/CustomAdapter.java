package com.example.sakshi.customlistview_listfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sakshi on 7/13/2017.
 */

public class CustomAdapter extends BaseAdapter {
    private ArrayList<Data> list ;
    LstFragment context;
    LayoutInflater  mLayoutInflator;
    public CustomAdapter(LstFragment context, ArrayList list){
        this.list = list;
        this.context = context;
        mLayoutInflator = (LayoutInflater)context.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mLayoutInflator.inflate(R.layout.row,null);
        TextView name1 = (TextView)convertView.findViewById(R.id.name);
        ImageView imageView1 = (ImageView)convertView.findViewById(R.id.image);
        TextView desc1 = (TextView) convertView.findViewById(R.id.desc);

        name1.setText(list.get(position).getName());
        desc1.setText(list.get(position).getDesc());
        imageView1.setImageResource(list.get(position).getId());
        return convertView;

    }
}
