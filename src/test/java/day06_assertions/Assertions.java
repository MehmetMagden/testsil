package day06_assertions;

import org.junit.Assert;
import org.junit.Test;

public class Assertions {
    int num1 = 10;
    int num2 = 20;
    int num3 = 30;

    @Test
    public void test02() {
        Assert.assertEquals(num3, num1 + num2); // PASSED
    }

    @Test
    public void test03() {
        Assert.assertNotEquals(num3, num2); // PASSED
    }

    @Test
    public void test04() {
        Assert.assertTrue(num3 == num2); // FAILED
    }

    @Test
    public void test05() {
        Assert.assertFalse(num3 == num2); // PASSED
    }
}
