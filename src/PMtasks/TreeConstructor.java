package PMtasks;

/**
 *
 * @author Rahimi
 */
public class TreeConstructor {

    /**
     * first convert the given array into int array then checks if this array
     * does not contain the duplicate children and the number of parent nodes
     * should not exceed 2.
     *
     * @param strArr
     * @return true if the structure of tree is correct.
     */
    boolean constructTree(String[] strArr) {
        assert !strArr.equals(null);
        int[][] arr = convertToInt(strArr);
        if (arr != null && !duplicateChilds(arr) && !parentValidation(arr)) {
            return true;
        }
        return false;
    }

    /**
     * convert the String array into a integer array
     *
     * @param strArray
     * @return
     */
    int[][] convertToInt(String[] strArray) {
        int[][] temp = new int[strArray.length][2];
        boolean isNull = false;
        for (int i = 0; i < strArray.length && !isNull; i++) {

            if (strArray[i] == null || strArray[i].isEmpty()) {
                isNull = true;
            } else {
                int firstP = strArray[i].indexOf("(");
                int comma = strArray[i].indexOf(",");
                int secondP = strArray[i].indexOf(")");
                String child = strArray[i].substring(firstP + 1, comma);
                String parent = strArray[i].substring(comma + 1, secondP);
                if (child != null && parent != null && !child.isEmpty() && !parent.isEmpty()) {
                    temp[i][0] = Integer.parseInt(child);
                    temp[i][1] = Integer.parseInt(parent);
                } else {
                    isNull = true;
                }
            }
        }
        return (!isNull) ? temp : null;
    }

    /**
     * return true if the child node is not unique.
     *
     * @param temp
     * @return
     */
    protected boolean duplicateChilds(int[][] temp) {
        boolean duplicate = false;
        for (int i = 0; i < temp.length && !duplicate; i++) {
            for (int j = i + 1; j < temp.length && !duplicate; j++) {
                if (temp[i][0] == temp[j][0]) {
                    duplicate = true;
                }
            }
        }
        return duplicate;
    }

    /**
     * checks if the parent is repeated more than twice
     *
     * @param temp
     * @return true id parent node is repeated more than twice
     */
    protected boolean parentValidation(int[][] temp) {
        boolean isNotBinary = false;
        int counter = 0;
        for (int i = 0; i < temp.length && !isNotBinary; i++) {
            for (int j = i + 1; j < temp.length && !isNotBinary; j++) {
                if (temp[i][1] == temp[j][1]) {
                    counter++;
                }
                if (counter > 2) {
                    isNotBinary = true;
                }
            }
        }
        return isNotBinary;
    }

}
