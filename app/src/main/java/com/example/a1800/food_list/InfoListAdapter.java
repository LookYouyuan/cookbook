package com.example.a1800.food_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.a1800.R;
import com.example.a1800.bean.FoodBean;
import org.w3c.dom.Text;

import java.util.List;

public class InfoListAdapter extends BaseAdapter {
    Context context;
    List<FoodBean>mDatas;

    public InfoListAdapter(Context context, List<FoodBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }
//决定ListView的行数，即集合的长度
    @Override
    public int getCount() {
        return mDatas.size();
    }
//返回指定位置对应的数据
    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }
//返回指定位置ID
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            //将布局转换成view对象的方法
            convertView = LayoutInflater.from(context).inflate(R.layout.item_infolist_lv, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        //加载控件显示内容，获取集合指定位置数据
        FoodBean foodBean = mDatas.get(position);
        holder.titleTv.setText(foodBean.getTitle());
        holder.jianjieTv.setText(foodBean.getJianjie());
        holder.iv.setImageResource(foodBean.getPicId());
        return convertView;
    }

    class ViewHolder{
        ImageView iv;
        TextView titleTv, jianjieTv;
        public ViewHolder(View view){
            iv = view.findViewById(R.id.item_info_iv);
            titleTv = view.findViewById(R.id.item_info_tv_title);
            jianjieTv = view.findViewById(R.id.item_info_tv_summary);
        }
    }
}
