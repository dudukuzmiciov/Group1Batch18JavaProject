package JavaProjectGroup1;

public class task5Swap2Numbers {
    /* Write a program to swap 2 numbers without a temporary variable  */
    public static void main(String[] args) {
        int a=2;
        int b=3;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
