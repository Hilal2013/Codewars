package kyu8;

import java.util.Arrays;

public class ReduceButGrow {

    public static void main(String[] args) {
        int[] arr={3,4,2,-1};
        System.out.println(multiplyOrder(arr));//-24
    }
    public static int multiplyOrder(int[] arr){
       return Arrays.stream(arr).reduce(1,(x,y)->x*y);
    }
//solution two
    // int result=1;
    //        Arrays.sort(arr);
    //        for (int i = 0; i < arr.length; i++) {
    //            result*=arr[i];
    //        }
    //        return result;
}
/*
Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */