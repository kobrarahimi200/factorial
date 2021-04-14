
package PMtasks;

/**
 *
 * @author Rahimi
 */
public class PMtasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//          String words = new String("??HELLO 12w2????GOODBYE!??");
//       List<Character> sample = new LinkedList<Character>();
//
//       for(int i = 0; i<words.length(); i++){
//           sample.add(words.charAt(i));
//       }
        String[] str = new String[]{"(1,)", "(3,2)", "(2,12)", "(5,2)"};
         String[] str2 = new String[]{"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
        int[][] temp = new int[][]{{1,2},{3,2},{2,12},{5,2}};
        QuestionMark q = new QuestionMark();
        PrimeNumbers primes = new PrimeNumbers();
        TreeConstructor tree = new TreeConstructor();
//        System.out.println("" + factorial(4));
//        System.out.println("quesionMark " + q.questionMarks("arrb6???4xxbl5??eee5"));
//        System.out.println(" xx  " + countQuestiomMark( sample));
//        System.out.println("is prime result :  " + isPrimeNumber(33));
//        System.out.println("return all primes  : " + primes.getPrimeNumbersTo(6));

        System.out.println(" tree " + tree.convertToInt(str) +",  "+ tree.duplicateChilds(temp) + "," + tree.parentValidation(temp));
//        System.out.println(" tree contructor " + tree.constructTree(str2));
    }
   /**
     * return the factorial of the given number
     *
     * @param x
     * @return
     */
    static int factorial(int x) {
        return (x > 0) ? x * factorial(x - 1) : 1;
    }


}
