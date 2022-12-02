package com.example.a1800.food_grid;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.a1800.R;
import com.example.a1800.bean.FoodBean;
import com.example.a1800.bean.FoodBelong;
import com.example.a1800.bean.FoodbelongBean;
import com.example.a1800.food_content.FoodBelongConActivity;

import java.util.List;

public class FoodGridActivity extends AppCompatActivity {

    GridView gv;
    List<FoodbelongBean> mDatas;
    private FoodGridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_grid);
        gv = findViewById(R.id.food_grid_gv);
        //数据源
        mDatas = FoodBelong.getAllList();
        //适配器
        adapter = new FoodGridAdapter(this, mDatas);
        gv.setAdapter(adapter);
        setListener();
    }

    private void setListener() {
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FoodbelongBean foodbelongBean = mDatas.get(position);
                Intent intent = new Intent(FoodGridActivity.this, FoodBelongConActivity.class);
                intent.putExtra("food",foodbelongBean);
                startActivity(intent);


            }
        });
    }
}
