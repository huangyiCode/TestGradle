package com.example.testvariant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 在清单中使用了flavor中的色值
         */
        setContentView(R.layout.activity_main);
        TextView mTvMain= (TextView) findViewById(R.id.tv_main);
        /**
         * 使用构建类型中的字符串
         */
        mTvMain.setText(BuildConfig.MESSAGE);
    }
}
