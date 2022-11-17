package com.example.lab0;
import junit.framework.TestCase;
import org.junit.Assert;

public class ExampleUnitTest extends TestCase {
    public void testMin1() {
        Assert.assertEquals(MainActivity.min(10, 2), 2);
    }
    public void testMin2() {
        Assert.assertEquals(MainActivity.min(-2, 100), -2);
    }
    public void testMin3() {
        Assert.assertEquals(MainActivity.min(-1, -10), -10);
    }
    public void testMin4() {
        Assert.assertEquals(MainActivity.min(0, 0), 0);
    }
    public void testMax1() {
        Assert.assertEquals(MainActivity.max(10, 1), 10);
    }
    public void testMax2() {
        Assert.assertEquals(MainActivity.max(0, 2), 2);
    }
    public void testMax3() {
        Assert.assertEquals(MainActivity.max(-123, -120), -120);
    }
    public void testMax4() {
        Assert.assertEquals(MainActivity.max(0, 0), 0);
    }
}