
public class Birthday {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int [] x = new int[days+2];
        double [] y = new double[days+2];

        for (int t = 0; t < trials; t++) {
            int people = 0;
            boolean[] hasBirthday = new boolean[days];
            while (true) {
                people++;
                int d = (int) (days * Math.random());
                if (hasBirthday[d]) break;
                hasBirthday[d] = true;
            }
            x[people - 1]++;
        }
        int sum = 0;
        int i = 0;
        while (i < x.length) {
            sum += x[i];
            y[i] = (double) sum / (double) trials;
            System.out.println(i + 1 + "\t" + x[i] + "\t" + y[i]);
            if (y[i] >= 0.50) break;
            else i++;
        }

        }

}
