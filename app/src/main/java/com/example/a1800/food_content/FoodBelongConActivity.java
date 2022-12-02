package com.example.a1800.food_content;

import android.content.Intent;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.a1800.R;
import com.example.a1800.bean.FoodbelongBean;

public class FoodBelongConActivity extends AppCompatActivity {

    TextView titleTv, ConTv;
    ImageView backIv, PicIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_belong_con);
        initView();
        Intent intent = getIntent();
        FoodbelongBean foodbelongBean = (FoodbelongBean) intent.getSerializableExtra("food");
        titleTv.setText(foodbelongBean.getBelong());
        ConTv.setText(foodbelongBean.getContent());
        PicIv.setImageResource(foodbelongBean.getSriId());
    }

    private void initView() {
        titleTv = findViewById(R.id.belong_title);
        ConTv   = findViewById(R.id.belong_con);
        backIv  = findViewById(R.id.belong_back);
        PicIv   = findViewById(R.id.belong_image);

        backIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); //销毁Activity
            }
        });
    }
}
