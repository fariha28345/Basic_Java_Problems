/* 16. Encrypt word: ROADTOSDET [when A=F]
Output: WTFIYTXIJY */

import java.util.*;

public class Encrypt_Word_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            ascii = ascii+5;
            char ch1 = (char) ascii;
            str1 = str1 + ch1;
        }
        System.out.println(str1);
    }
}
