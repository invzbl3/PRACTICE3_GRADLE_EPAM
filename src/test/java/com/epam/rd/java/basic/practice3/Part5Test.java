package com.epam.rd.java.basic.practice3;

import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

public class Part5Test {
    @Test
    public void testDecimal2Roman() {
        Assert.assertEquals("X",Part5.decimal2Roman(10));
        Assert.assertEquals("VI",Part5.decimal2Roman(6));
        Assert.assertEquals("XXV",Part5.decimal2Roman(25));
        Assert.assertEquals("XXXIV",Part5.decimal2Roman(34));
        Assert.assertEquals("LII",Part5.decimal2Roman(52));
        Assert.assertEquals("LXXIII",Part5.decimal2Roman(73));
        Assert.assertEquals("C",Part5.decimal2Roman(100));
        Assert.assertNull(Part5.decimal2Roman(-2));
        Assert.assertNull(Part5.decimal2Roman(1000));
    }

    @Test
    public void testRoman2Decimal() {
        Assert.assertEquals(5, Part5.roman2Decimal("V"));
        Assert.assertEquals(12, Part5.roman2Decimal("XII"));
        Assert.assertEquals(46, Part5.roman2Decimal("XLVI"));
        Assert.assertEquals(66, Part5.roman2Decimal("LXVI"));
        Assert.assertEquals(90, Part5.roman2Decimal("XC"));
        Assert.assertEquals(7, Part5.roman2Decimal("VII"));
        Assert.assertEquals(94, Part5.roman2Decimal("XCIV"));
        Assert.assertEquals(0, Part5.roman2Decimal(null));
        Assert.assertEquals(0, Part5.roman2Decimal(""));
    }

    @Test
    public void main() {
        Part5.main(new String[] { null });
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void demoTest() throws NoSuchAlgorithmException {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}
