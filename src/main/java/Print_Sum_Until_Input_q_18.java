/* 18. Write a program that will take integer numbers as user input continuously and
print the sum of numbers until user input q from the keyboard. When user input q, program will be quit.
If user inputs another character, then the program will ask to input the number again. */


import java.util.Scanner;

public class Print_Sum_Until_Input_q_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char ch;

        do{
            System.out.print("Enter a Number: ");
            sum = sum + sc.nextInt();
            System.out.print("Continue? any character/q: ");
            ch = sc.next().charAt(0);

        } while(ch != 'q');
        System.out.println("The sum of the numbers is: " +sum);

    }
}
