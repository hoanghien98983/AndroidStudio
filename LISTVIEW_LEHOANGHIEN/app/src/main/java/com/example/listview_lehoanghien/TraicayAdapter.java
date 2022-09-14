package com.example.listview_lehoanghien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraicayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Traicay> traicayList;

    public TraicayAdapter(Context context, int layout, List<Traicay> traicaylist){
        this.context = context;
        this.layout = layout;
        this.traicayList = traicaylist;
    }


    @Override
    public int getCount() {
        return traicayList.size();
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
        Traicay traicay = traicayList.get(i);

        holder.txtTen.setText(traicay.getTen());
        holder.txtMota.setText(traicay.getMota());
        holder.imgHinh.setImageResource(traicay.getHinh());
        return view;
    }
}
