/* 15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
"I live in Bangladesh"
Output:
Number of words: 4
Number of chars without spaces: 17
Number of vowels: 7
Number of consonant: 10 */

public class Count_Word_Character_Vowel_Consonant_15 {
    public static void main(String[] args) {
        String str = "I live in Bangladesh";
        String[] word = str.split(" ");
        System.out.println("Number of words: " + word.length);
        int number_of_char = 0;
        for(int i = 0; i < word.length; i++) {
            number_of_char += word[i].length();
        }
        System.out.println("Number of chars without spaces: " + number_of_char);

        int vowel = 0, consonant = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                consonant++;
            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonant: " + consonant);
    }
}
