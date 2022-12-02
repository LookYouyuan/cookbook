package com.example.a1800.food_content;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.a1800.R;
import com.example.a1800.bean.FoodBean;

public class FoodConActivity extends AppCompatActivity {
    TextView titleTv, conTv;
    ImageView backIv, PicIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_con);
        initView();
        //接受上一级页面传递的数据
        Intent intent = getIntent();
        FoodBean foodBean = (FoodBean) intent.getSerializableExtra("food");
        //设置控件显示
        titleTv.setText(foodBean.getTitle());
        conTv.setText(foodBean.getDesc());
        PicIv.setImageResource(foodBean.getPicId());
    }

    private void initView() {
        titleTv = findViewById(R.id.food_con_title);
        backIv  = findViewById(R.id.food_back);
        conTv   = findViewById(R.id.food_con);
        PicIv   = findViewById(R.id.food_image);
        backIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); //销毁Activity
            }
        });
    }
}
