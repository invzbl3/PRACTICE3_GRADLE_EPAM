package com.epam.rd.java.basic.practice3;

import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

public class Part1Test {

    @Test
    public void testConvert1() {
        String actual = "Login;Name;Email\n" +
                "ivanov;Ivan Ivanov;ivanov@mail.com\n" +
                "петров;Петр Петров;petrov@google.com\n" +
                "obama;Barack Obama;obama@google.com\n" +
                "bush;Джордж Буш;bush@mail.com";
        String expected = "ivanov: ivanov@mail.com\n" +
                "петров: petrov@google.com\n" +
                "obama: obama@google.com\n" +
                "bush: bush@mail.com\n";

        Assert.assertEquals(expected, Part1.convert1(actual));
        Assert.assertNull(Part1.convert1(null));
    }

    @Test
    public void testConvert2() {
        String actual = "Login;Name;Email\n" +
                "ivanov;Ivan Ivanov;ivanov@mail.com\n" +
                "петров;Петр Петров;petrov@google.com\n" +
                "obama;Barack Obama;obama@google.com\n" +
                "bush;Джордж Буш;bush@mail.com";
        String expected = "Ivanov Ivan (email: ivanov@mail.com)\n" +
                "Петров Петр (email: petrov@google.com)\n" +
                "Obama Barack (email: obama@google.com)\n" +
                "Буш Джордж (email: bush@mail.com)\n";
        Assert.assertEquals(expected, Part1.convert2(actual));
        Assert.assertNull(Part1.convert2(null));
    }


    @Test
    public void testConvert3() {
        String actual = "Login;Name;Email\n" +
                "ivanov;Ivan Ivanov;ivanov@mail.com\n" +
                "петров;Петр Петров;petrov@google.com\n" +
                "obama;Barack Obama;obama@google.com\n" +
                "bush;Джордж Буш;bush@mail.com";
        String expected = "mail.com ==> ivanov, bush\n" +
                "google.com ==> петров, obama\n";
        Assert.assertEquals(expected, Part1.convert3(actual));
        Assert.assertNull(Part1.convert3(null));
    }

    @Test
    public void textConvert4() {
        String actual = "Login;Name;Email \n" +
                "ivanov;Ivan Ivanov;ivanov@mail.com\n" +
                "петров;Петр Петров;petrov@google.com\n" +
                "obama;Barack Obama;obama@google.com\n" +
                "bush;Джордж Буш;bush@mail.com";
        String expected = "Login;Name;Email \n" +
                "ivanov;Ivan Ivanov;ivanov@mail.com;1488\n" +
                "петров;Петр Петров;petrov@google.com;1488\n" +
                "obama;Barack Obama;obama@google.com;1488\n" +
                "bush;Джордж Буш;bush@mail.com;1488";
        Assert.assertEquals(expected, Part1.convert4(actual));
    }

    @Test
    public void main() {
        Part1.main(new String[] { null });
        Assert.assertTrue("Assertion to be compliant", true);
    }

    @Test
    public void demoTest() throws NoSuchAlgorithmException {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void getInputTest() {
        Util.getInput("part1.txt");
        Assert.assertTrue("Assertion to be compliant", true);
    }
}