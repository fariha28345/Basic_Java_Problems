/* 12. Write a program that will shuffle (values will randomly change their position) from the given array

numbers=[1,2,3,4,5,6,7,8,9,0]

random output: 3 5 0 1 7 9 6 4 2 8 */
import java.util.*;
public class Shuffle_From_Array_12 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};

        Random rand = new Random();

        for(int i = 0; i < numbers.length; i++) {
            int rand_index = rand.nextInt(numbers.length);
            int tmp = numbers[i];
            numbers[i] = numbers[rand_index];
            numbers[rand_index] = tmp;
        }
        System.out.print("random output: ");
        for(int i = 0; i <numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
}
