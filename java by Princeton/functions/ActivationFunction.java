/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        double result;
        if (Double.isNaN(x)) {
            double d = Double.parseDouble("NaN");
            return d;
        }
        else if (x < 0.0) result = 0.0;
        else if (x == 0.0) result = 0.5;
        else result = 1.0;
        return result;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) {
            double d = Double.parseDouble("NaN");
            return d;
        }
        else return 1.0 / (1 + Math.pow(Math.E, -1 * x));

    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        double result;
        if (Double.isNaN(x)) {
            double d = Double.parseDouble("NaN");
            return d;
        }
        else if (x >= 20) result = 1.0;
        else if (x <= -20) result = -1.0;
        else result = ((Math.pow(Math.E, x) - Math.pow(Math.E, -x))) /
                ((Math.pow(Math.E, x) + Math.pow(Math.E, -x)));
        return result;
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        double result;
        if (Double.isNaN(x)) {
            double d = Double.parseDouble("NaN");
            return d;
        }
        else if (x == Double.POSITIVE_INFINITY) result = 1;
        else if (x == Double.NEGATIVE_INFINITY) result = -1;
        else result = x / (1 + Math.abs(x));
        return result;

    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        double result;
        if (Double.isNaN(x)) {
            double d = Double.parseDouble("NaN");
            return d;
        }
        else if (x <= -2) result = -1;
        else if (x < 0) result = x + Math.pow(x, 2) / 4;
        else if (x < 2) result = x - Math.pow(x, 2) / 4;
        else result = 1;
        return result;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        if (Double.isNaN(x)) {
            double d = Double.parseDouble("NaN");
            System.out.println(d);
        }
        System.out.println("heaviside(" + x +") = "+ heaviside(x));
        System.out.println("  sigmoid(" + x +") = "+ sigmoid(x));
        System.out.println("     tanh(" + x +") = "+ tanh(x));
        System.out.println(" softsign(" + x +") = "+ softsign(x));
        System.out.println("     sqnl(" + x +") = "+ sqnl(x));

    }
}
