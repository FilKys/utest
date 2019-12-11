package ru.fil.perebor;

import org.hamcrest.Matcher;

import java.util.Collections;
import java.util.List;

public class Sort {

    private Integer[] swap(Integer[] list, int x, int y) {
        int a;
        a = list[x];
        list[x] = list[y];
        list[y] = a;
        return list;
    }

    public Integer[] listSortBubble(Integer[] listInteger) {
        int a;
        for (int i = 0; i < listInteger.length - 1; i++) {
            for (int j = listInteger.length - 1; j > i; j--) {
                if (listInteger[j - 1] > listInteger[j]) {
                    listInteger = swap(listInteger, j, j - 1);
                }
            }
        }
        return listInteger;
    }

    public Integer[] listSortShaker(Integer[] listInteger) {
        boolean work = true;
        int beg = 0, end = listInteger.length - 1, a;
        while (work) {
            work = false;
            for (int i = beg; i < end; i++) {
                if (listInteger[i] > listInteger[i + 1]) {
                    work = true;
                    swap(listInteger, i, i + 1);
                }
            }
            if (!work) break;
            for (int i = end; i > beg; i--) {
                if (listInteger[i] < listInteger[i - 1]) {
                    work = true;
                    swap(listInteger, i, i - 1);
                }
            }
            beg++;
            end--;
        }
        return listInteger;
    }

    public Integer[] listSortComb(Integer[] listInteger) {
        double k = 1.2473309;
        int step = listInteger.length - 1;
        while (step > 1) {
            for (int i = 0; (i + step) < listInteger.length; i++) {
                if (listInteger[i] > listInteger[i + step]) {
                    listInteger = swap(listInteger, i, i + step);
                }
            }
            step = (int) (step / k);
        }
        boolean work = true;
        while (work) {
            work = false;
            for (int i = 0; i < listInteger.length - 1; i++) {
                if (listInteger[i] > listInteger[i + 1]) {
                    listInteger = swap(listInteger, i, i + 1);
                    work = true;
                }
            }
        }
        return listInteger;
    }

    public Integer[] listSortInsertion(Integer[] listInteger) {
        int j, num;
        for (int i = 1; i < listInteger.length; i++) {
            j = i - 1;
            num=listInteger[i];
            while (j >= 0 && listInteger[j] > num) {
                listInteger[j+1] = listInteger[j];
                listInteger[j] = num;
                j--;
            }
        }
        return listInteger;
    }
}
