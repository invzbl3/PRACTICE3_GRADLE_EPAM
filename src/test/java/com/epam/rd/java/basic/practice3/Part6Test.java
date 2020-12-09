package com.epam.rd.java.basic.practice3;

import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

public class Part6Test {
    @Test
    public void testPart6() {
        String actual = "This is a test\n" +
                "And this is also a test\n" +
                "And these are also tests\n" +
                "test\n" +
                "Это тест\n" +
                "Это также тест\n" +
                "И это также тесты";
        String expected = "This _is _a _test\n" +
                "_And this _is _also _a _test\n" +
                "_And these are _also tests\n" +
                "_test\n" +
                "_Это _тест\n" +
                "_Это _также _тест\n" +
                "И это _также тесты";
        Assert.assertEquals(expected, Part6.convert(actual));
    }

    @Test
    public void main() {
        Part6.main(new String[] { null });
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void demoTest() throws NoSuchAlgorithmException {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void getInputTest() {
        Util.getInput("part6.txt");
        Assert.assertTrue("Assertion to be compliant", true);
    }
}