/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.requests.DAOSetMark;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vlad
 */
public class DAOSetMarkTest {
    
   
    /**
     * Test of setMark method, of class DAOSetMark.
     */
    @Test
    public void testSetMark() throws Exception {
        System.out.println("setMark");
        String subject = "Java";
        int mark = 5;
        String lastName = "Vlad";
        String firstName = "Hnes";
        int expResult = 1;
        int result = DAOSetMark.setMark(subject, mark, lastName,firstName);
        assertEquals(expResult, result);
    }
    
}
