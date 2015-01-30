/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package issheoldenoughtodatecalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SuprTEK User
 */
public class IsSheTooYoungToDateCalculatorTest {

    public IsSheTooYoungToDateCalculatorTest() {
    }

    @Test
    public void testIsSheTooYoung_ThrowsZeroAgeException() {

        IsSheTooYoungToDateCalculator testObject = new IsSheTooYoungToDateCalculator();

    }

    @Test
    public void testIsSheTooYoung_returnsFalseWhenSheIsMyAgeOrOlder() {

        int minAge = 1;
        int maxAge = 100;

        IsSheTooYoungToDateCalculator testObject = new IsSheTooYoungToDateCalculator();

        for (int myAge = minAge; myAge <= maxAge; myAge++) {
            for (int herAge = minAge; herAge <= maxAge; herAge++) {
                for (int daughterAge = minAge; daughterAge <= maxAge; daughterAge++) {
                    if (herAge >= myAge) {
                        boolean expectedResult = false;
                        boolean testResult = testObject.isSheTooYoung(herAge, myAge, true, daughterAge);
                        assertEquals(expectedResult, testResult);
                        testResult = testObject.isSheTooYoung(herAge, myAge, false, daughterAge);
                        assertEquals(expectedResult, testResult);
                    }
                }
            }
        }

    }
    
    @Test
    public void testIsSheTooYoung_returnsTrueWhenMyDaughterIs25OrYoungerAndSheIsMyDaughtersAgeOrYounger() {

        int minAge = 1;
        int maxAge = 100;

        IsSheTooYoungToDateCalculator testObject = new IsSheTooYoungToDateCalculator();

        for (int myAge = minAge; myAge <= maxAge; myAge++) {
            for (int herAge = minAge; herAge <= maxAge; herAge++) {
                for (int daughterAge = minAge; daughterAge <= maxAge; daughterAge++) {
                    if (herAge < myAge) {
                        boolean expectedResult = (myAge - herAge) >= (myAge - daughterAge);
                        boolean testResult = testObject.isSheTooYoung(herAge, myAge, true, daughterAge);
                        assertEquals(expectedResult, testResult);
                    }
                }
            }
        }

    }

}
