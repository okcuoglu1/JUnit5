package Day1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test04_BeforeAll_AfterAll {

    //not Bütün test methodlarından önce bir method ve bütün testlerden sonra bir method calısmasını istersek...

    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll calıstı"); //test methodlarına girmeden önce bu kısımda hazırlık da yapabiliriz.
    }

    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll calıstı");
    }

    @Test
    void testWithArrays(){

        String str = "Unit test with JUnit5";

        String[] anlik = str.split(" ");
        String[] beklenen = {"Unit","test","with","JUnit5"};

        System.out.println("test1 calıstı");

        assertArrayEquals(beklenen, anlik,"diziler esit degil");

    }

    @Test
    void testWithArrays2(){

        String str = "Unit test with JUnit5";

        String[] anlik = str.split(" ");
        String[] beklenen = {"Unit","test","with","JUnit5"};

        System.out.println("test2 calıstı");

        assertArrayEquals(beklenen, anlik,"diziler esit degil");

    }

}
