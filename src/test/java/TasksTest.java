import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {

    @Test
    void testTask1Positive() {
        ByteArrayInputStream in = new ByteArrayInputStream("8".getBytes());
        PrintStream consoleStream = System.out;
        InputStream inputStream = System.in;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        System.setIn(in);
        Tasks.task1();
        String result = outputStream.toString();
        Assertions.assertEquals("Привет",result);
        System.setIn(inputStream);
        System.setOut(consoleStream);
    }
    @Test
    void testTask1Negative() {
        ByteArrayInputStream in = new ByteArrayInputStream("6".getBytes());
        PrintStream consoleStream = System.out;
        InputStream inputStream = System.in;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        System.setIn(in);
        Tasks.task1();
        String result = outputStream.toString();
        Assertions.assertEquals("",result);
        System.setIn(inputStream);
        System.setOut(consoleStream);
    }
    @Test
    void testTask1Edge() {
        ByteArrayInputStream in = new ByteArrayInputStream("7".getBytes());
        PrintStream consoleStream = System.out;
        InputStream inputStream = System.in;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        System.setIn(in);
        Tasks.task1();
        String result = outputStream.toString();
        Assertions.assertEquals("",result);
        System.setIn(inputStream);
        System.setOut(consoleStream);
    }

    @Test
    void testTask2Positive() {
        ByteArrayInputStream in = new ByteArrayInputStream("Вячеслав".getBytes());
        PrintStream consoleStream = System.out;
        InputStream inputStream = System.in;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        System.setIn(in);
        Tasks.task2();
        String result = outputStream.toString();
        Assertions.assertEquals("Привет, Вячеслав",result);
        System.setIn(inputStream);
        System.setOut(consoleStream);
    }
    @Test
    void testTask2Negative() {
        ByteArrayInputStream in = new ByteArrayInputStream("Руслан".getBytes());
        PrintStream consoleStream = System.out;
        InputStream inputStream = System.in;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        System.setIn(in);
        Tasks.task2();
        String result = outputStream.toString();
        Assertions.assertEquals("Нет такого имени",result);
        System.setIn(inputStream);
        System.setOut(consoleStream);
    }

    @Test
    void testTask3Positive() {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        Tasks.task3(new int[]{3, 2, 4, 5, 6, 9});
        String result = outputStream.toString();
        Assertions.assertEquals("369",result);
        System.setOut(consoleStream);
    }
    @Test
    void testTask3Negative() {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        Tasks.task3(new int[]{3, 2, 4, 5, 6, 9});
        String result = outputStream.toString();
        Assertions.assertNotEquals("3693",result);
        System.setOut(consoleStream);
    }
}