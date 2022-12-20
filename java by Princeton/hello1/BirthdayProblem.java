/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class BirthdayProblem {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int people = 0;
        boolean[] hasBirthday = new boolean[days];
        while (true) {
            people++;
            int d = (int) (days * Math.random());
            if (hasBirthday[d]) break;
            hasBirthday[d] = true;
        }
        System.out.println(people);
    }
}
