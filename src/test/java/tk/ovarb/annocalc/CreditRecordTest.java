/*
 *  maven clean test site
 *  allure serve allure-results
 *
 */

package tk.ovarb.annocalc;

import org.junit.*;

import org.junit.Assert;
// we can directly import static methods of Assert class and use this methods without class name
// ("assertEquals()" instead of "Assert.assertEquals()")

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
import static tk.ovarb.annocalc.CreditRecord.RATE;

public class CreditRecordTest {

    static CreditRecord tester;

    @BeforeClass
    public static void initialize() {
        tester = new CreditRecord(100000, 11000);
    }

    @Test
    public void testMonthIntAmount() {
        Assert.assertTrue(1000 == tester.monthIntAmount(100000, RATE));
    }

    @Test
    public void testMonthIntAmountNegative() {
        if (1000 != tester.monthIntAmount(100000, RATE)) {
            Assert.fail("Test upal!");
        }
    }

    @Test
    public void testCalculateInstallment() {
        Assert.assertEquals(8885,tester.calculateInstallment(100000, 12, RATE));
    }

    @Test
    public void testProposalLength() {
        Assert.assertEquals(11,tester.proposalLength(100000, 10000, RATE));
    }

    @AfterClass
    public static void cleanup() {
        tester = null;
    }

}

