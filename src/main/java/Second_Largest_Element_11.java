/* 11. Find out the second-largest element of the given array
numbers=[5,3,9,7,4,1,8]  */

public class Second_Largest_Element_11 {
    public static void main(String[] args) {
        int[] numbers = {5,3,9,7,4,1,8};
        int largest = numbers[0];
        int second_largest = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                second_largest = largest;
                largest = numbers[i];
            } else if (numbers[i] > second_largest){
                second_largest = numbers[i];
            }
        }
        System.out.println("Second largest element: " + second_largest);
    }
}
