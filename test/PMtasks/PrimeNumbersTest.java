package PMtasks;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Rahimi
 */
public class PrimeNumbersTest {

    PrimeNumbers primes = new PrimeNumbers();

    @Test
    public void testchecksIfPrimeIsCorrect() {
        assertTrue(primes.isPrimeNumber(31));
    }
     @Test
    public void testChecksNotPrime() {
        assertFalse(primes.isPrimeNumber(4));
    }
     @Test
    public void testChecksGetAllPrimes() {
        assertEquals(  "\"" + "2,3,5,7"+ "\"" , primes.getPrimeNumbersTo(10));
    }
   

}
