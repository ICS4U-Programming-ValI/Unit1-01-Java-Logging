import java.util.Scanner;

/**
 * The MathOperators program implements an application that
 * performs basic math operations including addition, subtraction,
 * multiplication, division, exponents, and square roots.
 *
 * <p>This class demonstrates proper JavaDoc formatting and usage of
 * various math operations.</p>
 *
 * @author Val I
 * @version 1.0
 * @since 2025-02-11
 */
public final class Logging {

    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        System.out.print("We will be calculating how many logs ");
        System.out.println("can fit in a truck");
        System.out.print("The different log lengths are");
        System.out.println("0.25 m, 0.5 m or 1m.");
        System.out.println("The truck can carry up to 1100 kg");
        System.out.println("The logs weigh 20 kg/m.");
        System.out.println("What log lengths should I calculate?");

        // making scanner and getting input
        final Scanner scanner = new Scanner(System.in);
        final float WEIGHTPERM = 20f;
        final float TRUCKWEIGHT = 1100f;
        final float QUART = 0.25f;
        final float HALF = 0.5f;
        final float FULL = 1f;

        try {
            // gets input from user
            final String logLengthStr = scanner.nextLine();

            // converts input to float
            final float logLthFlt = Float.parseFloat(logLengthStr);

            if (logLthFlt == FULL || logLthFlt == HALF || logLthFlt == QUART) {
                final float LOGWEIGHT = logLthFlt * WEIGHTPERM;
                final int LOGAMOUNT = Math.round(TRUCKWEIGHT / LOGWEIGHT);
                System.out.print("The truck can carry " + LOGAMOUNT);
                System.out.println(" logs");
            } else {
                System.out.print("This is not one of the log lengths.");
            }
        } catch (NumberFormatException ex) {
            // Handles error.
            System.out.println("Please input one of the length options");
        }
    }
}
