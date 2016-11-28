package com.example.administrator.testgradle;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/11/25.
 *
 *  androidTest
 *
 *    Espresso 功能测试
 */

public class MainActivityTest1 {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);
    @Before
    public void befor(){

    }
    @Test
    public void onClick() throws Exception {
        //在这里测试UI
        //测试UI的流程
        /**
         * 1.给EditText输入文本
         * 2.给Button设置点击事件
         * 3.给TextView设置文本
         * 4.验证TextView的文本是不是输入的文本
         *
         * 在输入的时候软键盘可能会覆盖按钮   导致View找不到
         *   解决方式:隐藏软键盘
         */
        Espresso.onView(withId(R.id.ect_content)).perform(typeText("h12422424242"));

        Espresso.onView(withId(R.id.btn_content)).perform(click());

        Espresso.onView(withId(R.id.tv_content)).check(matches(withText("测试--------")));

    }

}