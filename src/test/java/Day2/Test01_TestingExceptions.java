package Day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_TestingExceptions {

    //!!! Test ettiğimiz method beklediğimiz exceptionu farlattı mı? Onu kontrol ediyoruz. Tahmin edemediğimiz exception fırlar mı? kontrol edilir.

    @Test
    void testException(){

        String str = "Merhaba Dunya"; //13


        assertThrows(NullPointerException.class, ()-> {
            System.out.println("TestException çalıştı. ");
            str.length();
        });

    }


    //!!! Bölme islemi icin ArithmeticException kontrolu
    @Test
    void testException2(){

        int sayi1 = 1;
        int sayi2 = 0;

        //!!! Parent class yazarsak da test geçer -> RunTimeException
//        assertThrows(RuntimeException.class, ()-> {
//            System.out.println(sayi1/sayi2);
//        });
        assertThrows(ArithmeticException.class, ()-> {
            System.out.println(sayi1/sayi2);
        });

    }

    //Yukardaki senaryoyu method ekleyerek yapalım

    @Test
    void testException3(){

        int sayi1 = 1;
        int sayi2 = 0;

        assertThrows(ArithmeticException.class, ()-> {
            divide(sayi1,sayi2);
        });

    }

    private int divide(int x, int y){

        return x/y;
    }

}
