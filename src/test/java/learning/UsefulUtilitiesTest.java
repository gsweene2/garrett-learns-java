package learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsefulUtilitiesTest {
    @Test
    public void getHelloMessage_shouldReturnCorrectHelloMessage() {
        UsefulUtilities usefulUtilities = new UsefulUtilities();
        assertEquals("Hello world!", usefulUtilities.getHelloMessage());
    }
}
