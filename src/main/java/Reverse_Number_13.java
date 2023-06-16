/* 13. Take any number as input and print the reverse of the number
        input: 12345
        output: 54321 */

import java.util.*;
public class Reverse_Number_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number!= 0) {
            int r = number % 10;
            System.out.print(r);
            number = number / 10;
        }
    }
}
