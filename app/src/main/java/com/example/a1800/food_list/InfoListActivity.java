package com.example.a1800.food_list;

import android.content.Intent;
import android.service.autofill.OnClickAction;
import android.text.TextUtils;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.a1800.R;
import com.example.a1800.bean.FoodBean;
import com.example.a1800.bean.FoodUtils;
import com.example.a1800.food_content.FoodConActivity;

import java.util.ArrayList;
import java.util.List;

public class InfoListActivity extends AppCompatActivity implements View.OnClickListener {
    EditText searchEt;
    ImageView searchIv, flushIv;
    ListView showLv;
    //ListView数据源
    List<FoodBean>mDatas;
    List<FoodBean>allFoodList;
    private InfoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_list);
        //查找控件
        intiView();
        //找到数据源
        mDatas = new ArrayList<>();
        allFoodList = FoodUtils.getAllFoodList();
        mDatas.addAll(allFoodList);
        //创建适配器 BaseAdapter的子类
        adapter = new InfoListAdapter(this, mDatas);
        //设置适配器
        showLv.setAdapter(adapter);

        //设置单向点击监听
        setListener();
    }

    private void setListener() {
        showLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FoodBean foodBean = mDatas.get(position);
                Intent intent = new Intent(InfoListActivity.this, FoodConActivity.class);
                intent.putExtra("food",foodBean);
                startActivity(intent);
            }
        });
    }

    private void intiView(){
        searchEt = findViewById(R.id.info_et_search);
        searchIv = findViewById(R.id.info_iv_search);
        flushIv  = findViewById(R.id.info_iv_flush);
        showLv   = findViewById(R.id.infolist_lv);
        searchIv.setOnClickListener(this);//监听
        flushIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.info_iv_flush:
                mDatas.clear();
                mDatas.addAll(allFoodList);
                adapter.notifyDataSetChanged();
                searchEt.setText("");
                break;
            case R.id.info_iv_search:
                //判断不为空
                String msg = searchEt.getText().toString().trim();
                if (TextUtils.isEmpty(msg)) {
                    Toast.makeText(this,"输入内容不能为空！",Toast.LENGTH_SHORT).show();
                    return;
                }
                //搜索，把搜到添加到集合中
                List<FoodBean>list = new ArrayList<>();
                for (int i = 0; i < allFoodList.size(); i++) {
                    String title = allFoodList.get(i).getTitle();
                    if (title.contains(msg)) {
                        list.add(allFoodList.get(i));
                    }
                    mDatas.clear();   //清空适配器原数据
                    mDatas.addAll(list); //添加新数据源
                    adapter.notifyDataSetChanged(); //适配器更新
                }
                break;

        }
    }
}
