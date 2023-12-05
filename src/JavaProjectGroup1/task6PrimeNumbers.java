package JavaProjectGroup1;

public class task6PrimeNumbers {
    /*write a program to check whether a given num is prime or not
    prime  numbers-numbers that can only be deevided by 1 or itself,
     can not be devided by 2 or other num. Also, should be greater than 1(0 and 1 are not prime)
     2 is the only even prime number
     */
    public static void main(String[] args) {

        int num = 10;
        int divideCount = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    divideCount++;
            }
            if (divideCount == 2) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
