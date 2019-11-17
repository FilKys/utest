package ru.fil.sum;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UTestSum {

    private Sum sum;

    @Before
    public void initTest(){
        sum = new Sum();
    }

    @After
    public void afterTest() {
        sum = null;
    }

    @Test
    public void sumFloat(){
       Assert.assertEquals(10f,sum.floatSumXY(8.0f, 2.0f),0);
        System.out.println("sumFloat - "+true);
    }

    @Test
    public void sumInt(){
        Assert.assertEquals(10,sum.intSumXY(8, 3),1);
        System.out.println("sumInt - "+true);
    }

    @Test
    public void sum(){
        Assert.assertEquals(10,sum.intSumXY(8, 3),1);
        System.out.println("sumInt - "+true);
    }
}