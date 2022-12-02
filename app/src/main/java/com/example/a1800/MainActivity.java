package com.example.a1800;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    int time = 5;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            if (msg.what == 1) {
                time--;
                if (time == 0) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,HomeMenuActivity.class);
                    startActivity(intent);
                    finish();

                }else{
                    tv.setText(time + "");
                    handler.sendEmptyMessageDelayed(1,1000);
                }
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.main_tv);
        handler.sendEmptyMessageDelayed(1, 1000);
    }
}
