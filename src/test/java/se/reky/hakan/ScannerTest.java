package se.reky.hakan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScannerTest {

    Scanner scanner;

    @BeforeEach
    public void initialiseScanner () {

        scanner = new Scanner("test");
    }

    @Test
    public void testScannerHasNextLine () {

        assertTrue(scanner.hasNextLine());

    }

    @Test
    public void testScannerNextLine () {

        assertEquals("test", scanner.nextLine());

    }

}
