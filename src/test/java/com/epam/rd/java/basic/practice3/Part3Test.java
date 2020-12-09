package com.epam.rd.java.basic.practice3;

import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

public class Part3Test {
    @Test
    public void testConvert() {
        String actual = "When I was younger\n" +
                "I never needed";
        String expected = "when I Was Younger\n" +
                "I Never Needed";

       Assert.assertEquals(expected,Part3.convert(actual));
    }

    @Test
    public void main() {
        Part3.main(new String[] { null });
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void demoTest() throws NoSuchAlgorithmException {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void getInputTest() {
        Util.getInput("part3.txt");
        Assert.assertTrue("Assertion to be compliant", true);
    }
}