package util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx4 {
    public static void main(String[] args) {
        int[] arr = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };
        // Integer[] arr = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };

        // 검색
        // 1. 순차검색 - 첫번째부터 검색, 효능X
        // 2. 이진검색 - 반으로 나눠서 기준점보다 작으면 왼쪽 비교, 크면 오른쪽 비교 <- 이진검색을 하기 위해서는 정렬 필수
        // binarySearch
        Arrays.sort(arr); // 정렬 후
        int pos = Arrays.binarySearch(arr, 62); // 이진검색
        System.out.println("62는 " + (pos + 1) + "번째 위치함"); // pos+1
    }

}
