package ru.fil.perebor;

import org.hamcrest.Matcher;

import java.util.Collections;
import java.util.List;

public class Sort {
    public Matcher<? super List<Integer>> listSort(List<Integer> listInteger){
        Collections.sort(listInteger);
        return (Matcher<? super List<Integer>>) listInteger;
    }
}
