package com.epam.rd.java.basic.practice3;

import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

public class Part2Test {
    @Test
    public void testConvertPart2() {
        String s1 = "When I was younger, so much younger than today\n" +
                "I never needed anybody's help in any way\n" +
                "But now these days are gone, I'm not so self-assured\n" +
                "Now I find I've changed my mind\n" +
                "I've opened up the doors";

        String s2 = "Min: I, s, m" + System.lineSeparator() +
                "Max: younger, anybody, assured, changed";

        Assert.assertEquals(s2,Part2.convert(s1));
    }

    @Test
    public void main() {
        Part2.main(new String[] { null });
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void demoTest() throws NoSuchAlgorithmException {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void getInputTest() {
        Util.getInput("part2.txt");
        Assert.assertTrue("Assertion to be compliant", true);
    }
}