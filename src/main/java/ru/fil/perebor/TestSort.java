package ru.fil.perebor;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSort {

    private Sort sort;

    @Before
    public void initTest() {
        sort = new Sort();
    }

    @After
    public void afterTest() {
        sort = null;
    }

    @Test
    public void listSort() {
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        list1.add(2);
        list1.add(6);
        list1.add(22);
        list1.add(1);
        list1.add(5);
        list1.add(0);
        list1.add(3);
        list1.add(8);
        list1.add(9);

        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(22);

        Assert.assertThat(list2, sort.listSort(list1));
    }
}
