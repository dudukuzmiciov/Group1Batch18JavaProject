package JavaProjectGroup1;

public class task3EvenNum2Darray {
    /*Create a 2D array of int type where you will store odd and even numbers.
   Develop a program which will identify/print the even numbers only.
    */
    public static void main(String[] args) {
        int[][] num={
                {1,2,3,4},
                {5,5,7,8,9},
                {10,13,15,16}
        };
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++)
                if(num[i][j]%2==0){
                    System.out.print(num[i][j]+" ");
                }
        }

    }
}
