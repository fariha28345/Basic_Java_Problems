/* 5. Write a program that will find your key is found in the given array using linear search method
numbers=[1,6,9,3,5,4,7]
key=5 */

import java.util.*;
public class Linear_Search_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1,6,9,3,5,4,7};
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        int c = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                c = 1;
                break;
            }
        }
        if(c == 1) {
            System.out.println("Key is found");
        }
        else {
            System.out.println("Key is not found");
        }
    }
}
