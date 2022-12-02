package com.example.a1800;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.a1800.food_grid.FoodGridActivity;
import com.example.a1800.food_list.InfoListActivity;

public class HomeMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);
    }


    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.button_1:
                intent.setClass(HomeMenuActivity.this, InfoListActivity.class);
                break;
            case R.id.button_2:
                intent.setClass(HomeMenuActivity.this, FoodGridActivity.class);
                break;
            case R.id.button_3:
                intent.setClass(HomeMenuActivity.this, AboutActivity.class);
                break;
        }
        startActivity(intent);
    }
}
