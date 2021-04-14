package PMtasks;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Rahimi
 */
public class QuestionMark {

    /**
     * counts the number of question marks between two number
     *
     * @param str
     * @return
     */
    boolean questionMarks(String str) {
        int x = 0;
        int y = 0;
        List<Character> temp = new LinkedList<>();
        int counter = 0;
        boolean isDigit = false;
        for (int i = 0; i < str.toCharArray().length && !isDigit; i++) {
            x = 0;
            y = 0;
            if (isDigit(str.toCharArray()[i])) {
                counter = i + 1;
                x += toInteger(str.toCharArray()[i]);
                temp.clear();
                while (counter < str.toCharArray().length && !isDigit(str.toCharArray()[counter])) {
                    temp.add(str.toCharArray()[counter]);
                    counter++;
                }
                if (counter < str.toCharArray().length) {
                    y += toInteger(str.toCharArray()[counter]);
                }
                if (countQuestiomMark(temp) == 3 && x + y == 10) {
                    isDigit = true;
                    return true;
                }
                i = counter - 1;
            }
        }

        return false;
    }

    /**
     * convert the given char to integer
     *
     * @param c
     * @return
     */
    int toInteger(char c) {
        return Character.getNumericValue(c);
    }

    /**
     * return true if the given char is digit
     *
     * @param c
     * @return
     */
    boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    /**
     * counts the number of question marks in the given list
     *
     * @param temp
     * @return the number of question marks
     */
    int countQuestiomMark(List<Character> temp) {
        int counter = 0;
        for (int k = 0; k < temp.size(); k++) {

            if (temp.get(k).equals('?')) {
                counter++;
            }
        }
        return counter;
    }
}
