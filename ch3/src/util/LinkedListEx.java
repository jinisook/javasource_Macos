package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        // ms
        long startTime = System.currentTimeMillis();
        // long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }

        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList 걸린 시간 " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        // long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }

        endTime = System.currentTimeMillis();
        System.out.println("LinkedList 걸린 시간 " + (endTime - startTime) + " ms");

    }

}
