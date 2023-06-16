/* 7. Write a program that will break down the amount and count notes for any given amount. Here is the notes in the given array:
notes=[1000,500,200,100,50,20,10,5,2,1]
Example 1: User input: 575
Output:
500 1
50 1
20 1
5 1
Example 2: User input: 2148
Output:
1000 2
100 1
20 2
5 1
2 1
1 1  */

import java.util.*;
public class Count_Notes_7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("User input: ");
        int amount = sc.nextInt();

        int[] notes={1000,500,200,100,50,20,10,5,2,1};

        int count;

        for(int i=0;i<10;i++)
        {
            count=amount/notes[i];
            if(count!=0)
            {
                System.out.println(notes[i]+" "+count);
            }
            amount=amount%notes[i];
        }
    }
}
