package JavaProjectGroup1;

public class task8MinimumAndMaximumNumInArray {
    public static void main(String[] args) {
        //maximum and minimum number in  the array?
        int[] num = {8, 4, 3, 6, 9, 20};
        int maximum = num[0];
        int minimum = num[0];
        for (int i = 0; i< num.length;i++){
            if(num[i]<minimum){
                minimum=num[i];
            }if(num[i]>maximum){
                maximum=num[i];
            }
        }
        System.out.println(minimum+" is the minimum number");
        System.out.println(maximum+" is the maximum number");
    }
}
