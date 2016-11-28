package com.example.administrator.testgradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_content).setOnClickListener(this);
        /**
         * 第二构建类型  拥有特殊的依赖fastJson
         */
        if(BuildConfig.FLAG){
            JSON.parse("{\"a\":1,\"b\":2}");
        }
    }



    public int testMethrod(int a,int b){
           return a+b;
    }


    @Override
    public void onClick(View view) {
        TextView mTextView= (TextView) findViewById(R.id.tv_content);
        mTextView.setText("测试--------gaga");
    }
}
