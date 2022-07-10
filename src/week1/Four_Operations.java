package week1;
/* 9. Write a Java program to print the result of the following operations.
      Test Data: a. -5 + 8 * 6
                 b. (55+9) % 9
                 c. 20 + -3*5 / 8
                 d. 5 + 15 / 3 * 2 - 8 % 3 */
public class Four_Operations {
    public static void main(String args[]) {
        int a = (-5 + 8 * 6);
        int b = ((55 + 9) % 9);
        int c = (20 + -3 * 5 / 8);
        int d = (5 + 15 / 3 * 2 - 8 % 3);

        System.out.println(" Expected Output: "+a);
        System.out.println(" Expected Output: "+b);
        System.out.println(" Expected Output: "+c);
        System.out.println(" Expected Output: "+d);
    }

}
