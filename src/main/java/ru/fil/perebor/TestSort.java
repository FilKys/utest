package ru.fil.perebor;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSort {

    private Sort sort;
    private int max = 10000;
    private Integer[] list1;
    private Boolean[] booleans;
    private Integer[] list2;

    @Before
    public void initTest() {
        sort = new Sort();
        list1 = new Integer[max];
        list2 = new Integer[max];
        booleans = new Boolean[max];
        int rand;
        for (int i = 0; i < max; i++) {
            booleans[i] = false;
        }
        for (int i = 0; i < max; i++) {
            list2[i] = i;
            while (true) {
                rand = (int) (Math.random() * max);
                if (booleans[rand] == false) {
                    booleans[rand] = true;
                    list1[i] = rand;
                    break;
                }
            }
        }
    }

    @After
    public void afterTest() {
        sort = null;
    }

    @Test
    public void listSortBubble() {
        Assert.assertArrayEquals(list2, sort.listSortBubble(list1));
    }

    @Test
    public void listSortShaker() {
        Assert.assertArrayEquals(list2, sort.listSortShaker(list1));
    }

    @Test
    public void listSortComb() {
        Assert.assertArrayEquals(list2, sort.listSortComb(list1));
    }

    @Test
    public void listSortInsertion() {
        Assert.assertArrayEquals(list2, sort.listSortInsertion(list1));
    }
}
