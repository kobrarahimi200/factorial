
package PMtasks;

/**
 *
 * @author Rahimi
 */
public class PrimeNumbers {

    /**
     * The function should return all prime numbers which exist between 0 and
     * the given number as a comma separated string.
     *
     * @param number is a positive number
     * @return a string of all prim number which are smaller than the given number.
     */
     String getPrimeNumbersTo(int number) {
        String str = "";
        for (int i = 2; i <= number; i++) {
            if (isPrimeNumber(i)) {
                str += i + ",";
            }
        }
        return "\"" + str.substring(0, str.length() - 1) + "\"";
    }

    /**
     * checks if the given number is a prime number. It returns true if it is
     * one or false if not. A prime number is a number which only can be divided
     * without rest by itself and 1.
     *
     * @param number is a positive number
     * @return a boolean value
     */
     boolean isPrimeNumber(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
