package se.reky.hakan;

import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestIOHandler {

    private IOHandler ioHandler (String dataForScanner) {

        IOHandler ioHandler = new IOHandler(new Scanner(dataForScanner));

        return ioHandler;
    };

    //Scanner scanner;

    @Test
    public void testIoHandler () {
        ioHandler("test");

        Assertions.assertEquals("test", ioHandler("test").nextLine());
    }

    @Test
    public void testHasNextInt () {

        ioHandler("1");

        boolean hasInt = ioHandler("2").hasNextInt();

        Assertions.assertTrue(hasInt);

    }

}
