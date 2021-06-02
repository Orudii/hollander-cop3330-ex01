package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_name_and_greeting() {
        App myApp = new App();
        String name = "Difo";

        String expectedOutput = "Hello, Difo, nice to meet you!";
        String actualOutput = myApp.generateOutputString(name);

        assertEquals(expectedOutput, actualOutput);
    }
}