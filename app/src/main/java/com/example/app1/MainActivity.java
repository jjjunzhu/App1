package com.example.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView show = (TextView) findViewById(R.id.text1);
        SharedPreferences sp = getSharedPreferences("count",
                MODE_PRIVATE);
        // 读取SharedPreferences里的count数据
        int count = sp.getInt("count", 0);
        // 显示程序以前使用的次数
        show.setText("该程序之前被使用了" + count + "次");
        Editor editor = sp.edit();
        // 存入数据
        editor.putInt("count", ++count);
        // 提交修改
        editor.commit();
    }

}
