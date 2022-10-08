package com.example.lehoanghien_dangnhap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NhacAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Nhac> nhacList;

    public NhacAdapter(Context context, int layout, List<Nhac> traicaylist){
        this.context = context;
        this.layout = layout;
        this.nhacList = traicaylist;
    }


    @Override
    public int getCount() {
        return nhacList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen, txtMota;

    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            //ánh xạ view
            holder.txtTen = (TextView) view.findViewById(R.id.textviewten);
            holder.txtMota = (TextView) view.findViewById(R.id.textviewmota);
            holder.imgHinh = (ImageView) view.findViewById(R.id.imageviewhinh);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }


        //gán giá trị
        Nhac nhac = nhacList.get(i);

        holder.txtTen.setText(nhac.getTen());
        holder.txtMota.setText(nhac.getMota());
        holder.imgHinh.setImageResource(nhac.getHinh());
        return view;
    }
}
