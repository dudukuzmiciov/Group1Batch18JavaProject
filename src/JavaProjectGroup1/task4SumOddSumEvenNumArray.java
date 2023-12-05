package JavaProjectGroup1;

public class task4SumOddSumEvenNumArray {
    /*create a 2D array of integers. Develop a program that will calculate
   the sum of even and odd numbers for that array
    */
    public static void main(String[] args) {
        int[][] num = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 12, 14, 16}
        };
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    sumEven = sumEven + num[i][j];
                } else {
                    sumOdd = sumOdd + num[i][j];
                }

            }
        }
        System.out.println("the sum of all even numbers is "+sumEven);
        System.out.println("the sum of all odd numbers is "+sumOdd);}

}
