package com.gurudev;

import java.util.ArrayList;

public class MaxMinInArrayList {

    public int maxInArrayList(ArrayList<Integer> list) {

        int max = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public int minInArrayList(ArrayList<Integer> list) {
        int min = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }
}
