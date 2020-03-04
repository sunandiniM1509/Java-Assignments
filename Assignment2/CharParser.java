import java.util.*;
public class CharParser {
    static boolean checkCharacter(String input)
    {
        int[] countchar = new int[26];
        int length = input.length();
        for(int i=0;i<length;i++)
            countchar[input.charAt(i)-'a']++;
        for(int j=0;j<26;j++)
        {
            if(countchar[j]<1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input =scanner.nextLine();
    System.out.println(checkCharacter(input));
    }
}
// Time Complexity is O(n) where n is the length of the string {O(N+26).. 26 is neglected compared to size of n}.
// Space Complexity is O(26), a constant array of size 26 (count lower case alphabets )