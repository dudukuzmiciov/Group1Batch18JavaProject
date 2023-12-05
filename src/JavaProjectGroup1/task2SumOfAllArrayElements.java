package JavaProjectGroup1;

public class task2SumOfAllArrayElements {
    /*Create an array of integer values.After the array is created,calculate te sum
    of all stored elements in that array
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum=array[i] + sum;
        }
        System.out.println("the sum of all araay numbers is "+sum);
    }
}
