package JavaProjectGroup1;

import java.util.Arrays;

public class task9SecondLargestNumArray {
    public static void main(String[] args) {
        //find the second largest number in an array
        //(sort the array in ascending  order first and the find the second largest
        int[] arr = {8, 7, 9, 10, 12};
        int size=arr.length;
        Arrays.sort(arr);
        System.out.println("second largest number in this array is "+arr[size-2]);
    }
}
