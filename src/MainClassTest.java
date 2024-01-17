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
    public void testGetClassNumber() {
        {
            System.out.println("Test testGetClassNumber launched");
        }
        MainClass actualNumber = new MainClass();
        int expectedNumber = 45;

        Assert.assertTrue("actualNumber =< 45",expectedNumber <= actualNumber.getClassNumber());
    }

}
