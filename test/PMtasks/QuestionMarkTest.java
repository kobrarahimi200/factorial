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
public class QuestionMarkTest {
    
    QuestionMark q = new QuestionMark();

    @Test
    public void testWrongNumberOfQueMark() {
        assertFalse(q.questionMarks("arrb6??4xxbl5??rrefrdfgdgfgfdgth5"));
    }
    @Test
    public void testCorrectNumberOfQueMark() {
        assertTrue(q.questionMarks("g5??5???xxbl5??eee5"));
    }
    @Test
    public void testCorrectWrongSummedNumbers() {
        assertFalse(q.questionMarks("g5??3???xxbl5??edewfwx23423"));
    }
    
}
