package se.reky.hakan;

import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IOHandlerTest {

    private IOHandler ioHandler (String dataForScanner) {

        IOHandler ioHandler = new IOHandler(new Scanner(dataForScanner));

        return ioHandler;
    };

    //Scanner scanner;

    @Test
    public void testIoHandler () {
        ioHandler("test");

        assertEquals("test", ioHandler("test").nextLine());
    }

    @Test
    public void testHasNextInt () {

        ioHandler("1");

        boolean hasInt = ioHandler("2").hasNextInt();

        assertTrue(hasInt);

    }

}
