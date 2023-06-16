/* 6. Generate random 10 integer numbers in an array and print out all the numbers from array and
also print the max and min number from the array */

public class RandomArray_Max_Min_6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int max = array[0];
        int min = array[0];
        for(int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
            if(max < array[i]) {
                max = array[i];
            }
            if(min > array[i]) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
