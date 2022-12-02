package com.example.a1800.food_grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.a1800.R;
import com.example.a1800.bean.FoodbelongBean;

import java.util.List;

public class FoodGridAdapter extends BaseAdapter {

    Context context;
    List<FoodbelongBean>mDatas;

    public FoodGridAdapter(Context context, List<FoodbelongBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //声明ViewHoler
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_foodgrid, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        //获取数据
        FoodbelongBean foodbelongBean = mDatas.get(position);
        holder.iv.setImageResource(foodbelongBean.getSriId());
        holder.tv.setText(foodbelongBean.getBelong());
        return convertView;
    }

    class ViewHolder{
        ImageView iv;
        TextView tv;
        public ViewHolder(View view){
            iv = view.findViewById(R.id.item_grid_iv);
            tv = view.findViewById(R.id.item_grid_tv);
        }
    }
}
