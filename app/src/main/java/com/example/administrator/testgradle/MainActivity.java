package com.example.administrator.testgradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.fastjson.JSON;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 第二构建类型  拥有特殊的依赖fastJson
         */
        if(BuildConfig.FLAG){
            JSON.parse("{\"a\":1,\"b\":2}");
        }
    }
}
