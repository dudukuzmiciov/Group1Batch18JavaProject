package JavaProjectGroup1;

public class task7Fibonacci {
    public static void main(String[] args) {
        // print first 10 Fibonacci series (the sum of previous two numbers)
        int num1=0;
        int num2=1;
        int sum;
        System.out.print(num1+" "+num2);
        for(int i=2;i<20;i++){
            sum=num1+num2;
            System.out.print(" "+sum);
            num1=num2;
            num2=sum;

        }
    }
}
