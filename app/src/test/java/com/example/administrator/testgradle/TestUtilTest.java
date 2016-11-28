package com.example.administrator.testgradle;

import android.util.Log;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/11/28.
 */
public class TestUtilTest {

    private static TestUtil  mTestUtil;
    @BeforeClass
    public static void beforeClass(){
        System.out.print("beforeClass--------");
        mTestUtil=new TestUtil();
    }
    @Before
    public void setUp() throws Exception {
        System.out.print("setUp--------");
    }

    @Test(timeout = 3000)
    public void addA() throws Exception {
        System.out.print("addA--------");
        Thread.sleep(2000);
        Assert.assertEquals(1+2,mTestUtil.addA(1,2));
    }

    @Test
    public void addB() throws Exception {
        System.out.print("addB--------");
        Assert.assertEquals(1+2,mTestUtil.addB(1,2));
    }

    @Test
    public  void subString() throws Exception{
        Assert.assertEquals(null,mTestUtil.subString(null));
        Assert.assertEquals("",mTestUtil.subString(""));
    }

    @After
    public void tearDown() throws Exception {
        System.out.print("tearDown--------");
    }


    @AfterClass
    public static void afterClass(){
        System.out.print("afterClass--------");
    }
}