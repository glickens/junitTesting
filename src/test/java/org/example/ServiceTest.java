package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        // Redirect System.out to capture the output for testing
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        // Restore original System.out
        System.setOut(originalOut);
    }

    @Test
    void getTestNeg() {
        Service service = new Service();
        String result = service.getName(-1);
        assertEquals("a", result);
    }

    @Test
    void getPositiveNumber() {
        Service service = new Service();
        String result = service.getName(2);
        assertEquals("b", result);
    }

    @Test
    void getZeroNumber() {
        Service service = new Service();
        String result = service.getName(0);
        assertEquals("a", result);
    }

    @Test
    void testWalk() {
        Service service = new Service();
        service.walk(3);

        // Verify the output
        String expectedOutput =
                "You take: 3 steps." + System.lineSeparator() +
                        "You take: 2 steps." + System.lineSeparator() +
                        "You take: 1 steps." + System.lineSeparator();

        assertEquals(expectedOutput, outputStream.toString());
    }
}
