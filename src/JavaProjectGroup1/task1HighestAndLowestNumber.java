package JavaProjectGroup1;

public class task1HighestAndLowestNumber {
    public static void main(String[] args) {
        /*create a program that uses an array to store a list of temperatures for a week,
         and then uses loop to find the highest and lowest temperature for the week*/
        int[] temperature = {5, 8, 11, 7, 3, 0, 2};
        int higher=temperature[0];
        int lower=temperature[0];
        for(int i=0;i< temperature.length;i++){
            if(temperature[i]>higher){
                higher=temperature[i];
            }
            if(temperature[i]<lower){
                lower=temperature[i];
            }
        }
        System.out.println("The highest temperature of this week is "+higher);
        System.out.println("The lowest temperature of this week is "+lower);
    }
}
