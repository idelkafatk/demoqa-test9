package guru.qa.docs;

import org.junit.jupiter.api.*;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("before");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after");
    }

    @Test
    void firstTest() {
        System.out.println("first");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        System.out.println("second");
        Assertions.assertTrue(true);
    }
}
