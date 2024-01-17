import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest {
    MainClass actualNumber = new MainClass();

    @Before
    public void startTestText() {
        System.out.println("Test start");
    }

    @After
    public void finishTestText() {
        System.out.println("Test finish");
    }

    @Test
    public void testGetLocalNumber() {
        {
            System.out.println("Test testGetLocalNumber launched");
        }
        MainClass actualNumber = new MainClass();
        int expectedNumber = 14;

        Assert.assertEquals("actualNumber != expectedNumber",expectedNumber,actualNumber.getLocalNumber());
    }

}
