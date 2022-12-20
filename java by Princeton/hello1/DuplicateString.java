/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.HashSet;

public class DuplicateString {
    public static void main(String[] args) {
        String s = args[0];
        HashSet<Character> hashSet = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!hashSet.contains(c)) {
                hashSet.add(c);
            }
            else
                System.out.println("It's duplicate!");

            //String str1 = "test"
            //String str2 = "demo"
        }

        System.out.println("It's Not duplicated!");
    }
}
