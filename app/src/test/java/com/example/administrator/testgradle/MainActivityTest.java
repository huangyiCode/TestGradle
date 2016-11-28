package com.example.administrator.testgradle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * Created by Administrator on 2016/11/24.
 *
 * 测试存在生命周期  按照注解的顺序
 *
 * 断言的方法:
 *
 *   Assert.assertEquals(期待值，实际值);
 *
 *    Assert.assertNotNull();
 *
 *     assertSame();
 *
 *     assertTrue();
 *
 *     一般情况下传临界值进行测试
 *
 *     主要测试的方法:  功能方法，接口
 *          单元测试规格
 *
 * 可以使用单月测试对接口进行调试
 */
public class MainActivityTest {

    static MainActivity activity;

    @BeforeClass
    public static void beforClass(){
          activity=new MainActivity();
    }



    @Before
    public void befor(){

    }



    @Test
    public void testMethrod() throws Exception {
         int a= activity.testMethrod(1,Integer.MAX_VALUE);

        Assert.assertEquals(1+Integer.MAX_VALUE,a);
    }

    @After
    public void after(){

    }

    @AfterClass
    public static void afterClass(){

    }

}