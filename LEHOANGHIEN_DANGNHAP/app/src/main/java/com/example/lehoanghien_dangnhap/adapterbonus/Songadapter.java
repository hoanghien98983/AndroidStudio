package com.example.lehoanghien_dangnhap.adapterbonus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lehoanghien_dangnhap.R;
import com.example.lehoanghien_dangnhap.model.Employee;

import java.util.List;

public class Songadapter extends BaseAdapter {
    private Context context;
    private List<Employee> list;


    public Songadapter(Context context, List<Employee> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int iPosition) {
        return list.get(iPosition);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.layout_song_item,null);
        }

        TextView tviewname = view.findViewById(R.id.tviewname);
        TextView tviewsalary = view.findViewById(R.id.tviewsalary);
        Employee emp = list.get(i);
        tviewname.setText(emp.getName());
        tviewsalary.setText("" + emp.getSalary());

        return view;
    }
}
