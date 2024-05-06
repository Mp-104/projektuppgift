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
    public void test1 () {
        ioHandler("test");

        Assertions.assertEquals("test", ioHandler("test").nextLine());
    }
}
