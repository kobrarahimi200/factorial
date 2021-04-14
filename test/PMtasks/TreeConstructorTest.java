/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMtasks;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rahimi
 */
public class TreeConstructorTest {
    
    
    String[] str2 = new String[]{"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
    int[][] temp = new int[][]{{1, 2}, {3, 2}, {2, 12}, {5, 2}};

    @Test
    public void testNullParentNode() {
        String[] str = new String[]{"(1,)", "(3,2)", "(2,12)", "(5,2)"};
        TreeConstructor tree = new TreeConstructor();
        assertFalse(tree.constructTree(str));
    }
    @Test
    public void testChecksNullArray() {
        String[] str = new String[]{null, "(3,2)", "(2,12)", "(5,2)"};
        TreeConstructor tree = new TreeConstructor();
        assertFalse(tree.constructTree(str));
    }
    @Test
    public void testChecksEmptyPairArray() {
        String[] str = new String[]{"", "(3,2)", "(2,12)", "(5,2)"};
        TreeConstructor tree = new TreeConstructor();
        assertFalse(tree.constructTree(str));
    }
    @Test
    public void testChecksDuplicateChildPairs() {
        String[] str = new String[]{"(1,2)", "(1,2)", "(2,12)", "(5,2)"};
        TreeConstructor tree = new TreeConstructor();
        assertFalse(tree.constructTree(str));
    }
    @Test
    public void testChecksCorrectTree() {
        String[] str = new String[]{"(1,2)", "(2,3)", "(6,2)", "(3,4)"};
        TreeConstructor tree = new TreeConstructor();
        assertTrue(tree.constructTree(str));
    }
    @Test
    public void testChecksMoreChilds() {
        String[] str = new String[]{"(1,2)", "(2,3)", "(6,2)", "(3,4)" , "(1,6)"};
        TreeConstructor tree = new TreeConstructor();
        assertFalse(tree.constructTree(str));
    }
     @Test
    public void testChecksMoreParent() {
        String[] str = new String[]{"(1,2)", "(2,3)", "(6,2)", "(3,4)" , "(5,2)"};
        TreeConstructor tree = new TreeConstructor();
        assertFalse(tree.constructTree(str));
    }
}
