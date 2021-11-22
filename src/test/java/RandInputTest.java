import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandInputTest {
    RandInput randomInput = new RandInput();
    @Test
    void getInputIntGreaterThanZero() {
        assertTrue(randomInput.getInputInt()>=0);
    }
    @Test
    void getInputIntGreaterLessThanThree() {
        assertTrue(randomInput.getInputInt()<3);
    }
}