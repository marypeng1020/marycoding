/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Test1 {
    public static void main(String[] args) {
        String s1 = "Hi";
        s1 = Test.duplicate(s1);

        String t1 = "Bye";
        t1 = Test.duplicate(Test.duplicate(t1));
        StdOut.println(s1 + t1);

    }
}
