package Day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {

    //not Testlerin calisma sırasını kendimiz belirlemek istiyorsak Junit4-> @FixMethodOrder
    //not Junit5 -> @TestMethodOrder
    String str;

    @BeforeEach
        //Bu classdaki her method calısmadan önce u method calısıcak
    void beforeEach() {

        str = "JUnit5 is better than JUnit4";
        System.out.println("********BeforeEach() calisti************");

    }

    @AfterEach
        //Bu classdaki her method calistiktan sonra bu method calısıcak
    void afterEach() {
        str = null;
        System.out.println("********AfterEach() calisti************");

    }

    @Test
    void testSplit(TestInfo info){ //calisan testin ismini console da görmek icin TestInfo KULLANILDI.
        String[] anlik = str.split(" ");
        String[] beklenen = {"JUnit5","is","better","than","JUnit4"};
        System.out.println(info.getDisplayName());

        assertTrue(Arrays.equals(beklenen,anlik));

    }

    @Test
    void testStringLength(){

        int anlik = str.length();
        int beklenen = 28;

        assertEquals(beklenen,anlik);

    }



}
