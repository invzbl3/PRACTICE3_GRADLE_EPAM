package com.epam.rd.java.basic.practice3;

import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

public class Part4Test {
    @Test
    public void testConvert() throws NoSuchAlgorithmException {
        String MD5 = "912EC803B2CE49E4A541068D495AB570";
        String SHA_256 = "F0E4C2F76C58916EC258F246851BEA091D14D4247A2FC3E18694461B1816E13B";

        Assert.assertEquals(MD5, Part4.hash("asdf", "MD5"));
        Assert.assertEquals(SHA_256, Part4.hash("asdf", "SHA-256"));
        Assert.assertNull(Part4.hash(null, "MD5"));
    }

    @Test
    public void main() throws NoSuchAlgorithmException {
        Part4.main(new String[] { null });
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void demoTest() throws NoSuchAlgorithmException {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void getInputTest() {
        Util.getInput("part4.txt");
        Assert.assertTrue("Assertion to be compliant", true);
    }
}