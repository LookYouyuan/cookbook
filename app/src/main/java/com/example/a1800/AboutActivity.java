package com.example.a1800;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.provider.ContactsContract;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {

    ViewPager aboutVp;
    TextView shareTv;
    LinearLayout pointLayout;
    List<View> viewList;   //ViewPager数据源

    int[]picId = {R.mipmap.food1, R.mipmap.food2, R.mipmap.food3, R.mipmap.food4, R.mipmap.food5, };
    private AboutAdapter adapter;

    List<ImageView>pointList;   //点

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            if (msg.what == 1) {
                //接收消息，使ViewPager向下滑动一页
                int current = aboutVp.getCurrentItem();
                aboutVp.setCurrentItem(current + 1);
                handler.sendEmptyMessageDelayed(1, 2000);
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        aboutVp = findViewById(R.id.about_vp);
        shareTv = findViewById(R.id.about_share);
        pointLayout = findViewById(R.id.about_point);
        shareTv.setOnClickListener(this);

        viewList = new ArrayList<>();
        pointList = new ArrayList<>();


        //初始化ViewPager页面
        for (int i = 0; i < picId.length; i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.item_about,null);
            ImageView iv = view.findViewById(R.id.item_about);
            iv.setImageResource(picId[i]);
            viewList.add(view);

            //创建小点
            ImageView pointIv = new ImageView(this);
            //设置属性
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            lp.setMargins(0,0,20,0);
            pointIv.setLayoutParams(lp);
            pointIv.setImageResource(R.mipmap.space);
            //添加到集合中
            pointList.add(pointIv);
            //添加到布局中
            pointLayout.addView(pointIv);

        }
        //第一个红点为选中
        pointList.get(0).setImageResource(R.mipmap.red);
        //创建适配器对象
        adapter = new AboutAdapter(viewList);
        //设置适配器
        aboutVp.setAdapter(adapter);

        //切换页面消息
        handler.sendEmptyMessageDelayed(1, 2000);

        //设置ViewPager页面监听
        setVPLister();

    }

    private void setVPLister() {
        aboutVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < pointList.size(); i++) {
                    pointList.get(i).setImageResource(R.mipmap.space);
                }
                pointList.get(position % pointList.size()).setImageResource(R.mipmap.red);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String msg = "分享内容";
        intent.putExtra(Intent.EXTRA_TEXT,msg);
        startActivity(Intent.createChooser(intent,"分享标题"));
    }
}
