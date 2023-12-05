package JavaProjectGroup1;

public class task10DuplicatesFromArrayOfString {
    public static void main(String[] args) {
        //print out  duplicate elements from  an  array of strings
        String[] str = {"math", "geography", "biology", "math", "biology"};
        boolean isDuplicate=false;
        for (int i = 0; i < str.length; i++) {
            for (int j =i+1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    System.out.println("Duplicate element is " + str[i]);
                    isDuplicate = true;
                }

            }

        }
        if (isDuplicate == false) {
            System.out.println("there are no duplicate elements");

        }

    }
}
