/* 4. Write a program that will find your key is found in the given array using binary search method
        numbers=[1,6,9,3,5,4,7]
        key=5 */

import java.util.*;

public class Binary_Search_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1,6,9,3,5,4,7};
        Arrays.sort(numbers);
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        int l = 0;
        int h = numbers.length - 1;
        int mid = (l + h) / 2;
        while (l <= h) {
            if (numbers[mid] < key) {
                l = mid + 1;
            }
            else if (numbers[mid] > key) {
                h = mid - 1;
            }
            else {
                System.out.println("Key is found");
                break;
            }
            mid = (l + h) / 2;

        }
        if (l > h) {
            System.out.println("Key is not found");
        }

    }
}
