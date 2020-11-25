import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber() {
        int expected = this.getLocalNumber();
        if (expected == 14) {
            System.out.println("Test completed successfully");
        }
        else {
            System.out.println("Test Failed " + expected + "!=14");
        }
    }

}
