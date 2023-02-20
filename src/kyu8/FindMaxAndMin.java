package kyu8;

import java.util.Arrays;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] list={2,-1,10,8};

        System.out.println(findMin(list));
        System.out.println(findMax(list));
    }
    public static int findMin(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static int findMax(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
/*
Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language )
 that receive a list of integers as input, and return the largest and lowest number in that list, respectively.
 */