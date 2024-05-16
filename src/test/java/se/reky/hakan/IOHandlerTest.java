package se.reky.hakan;

import java.util.Scanner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IOHandlerTest {

    private IOHandler getIoHandler(String dataForScanner) {

        IOHandler ioHandler = new IOHandler(new Scanner(dataForScanner));

        return ioHandler;
    };

    //Scanner scanner;

    @Test
    public void testIoHandler () {
        getIoHandler("test");

        assertEquals("test", getIoHandler("test").nextLine());
    }



    @Test
    public void shouldReturnTrueIfIntPresent () {

        boolean hasInt = getIoHandler("2").hasNextInt();

        assertTrue(hasInt);

    }

}
