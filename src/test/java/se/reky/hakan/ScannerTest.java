package se.reky.hakan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScannerTest {

    private Scanner scanner;

    @BeforeEach
    public void initialiseScanner () {

        scanner = new Scanner("test");
    }

    @Test
    public void shouldReturnTrueIfScannerHasStringValue () {

        assertTrue(scanner.hasNextLine());

    }

    @Test
    public void shouldReturnTest () {

        assertEquals("test", scanner.nextLine());

    }

}
