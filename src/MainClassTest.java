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
            System.out.println("Test testGetClassString launched");
        }
        MainClass actualString = new MainClass();
            if (actualString.getClassString().contains("hello")){
                System.out.println("class_string contains hello");
            } else if (actualString.getClassString().contains("Hello")) {
                System.out.println("class_string contains Hello");
            } else {Assert.fail("class_string not contains Hello or hello");
        }
    }

}
