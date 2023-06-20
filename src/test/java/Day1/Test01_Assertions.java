package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test(){
        //main methodu yok nasıl calısıyor?
        //JUnit icinde gömülü olarak main methodu cagrılıyor...
        //JUnit5 (Jupiter) ile beraber methodların erişim belirleyicisini public yapmak zorunda değiliz...

    }

    @Test
    public void testLenght(){
        //Normalde böyle değişken olusturulmaz olan methodu test edilir ama suan biz öğrenmek icin böyle yapıyoruz.
        String cumle = "Merhaba dünyam"; //14 karakter
        int anlikDeger = cumle.length();
        int beklenenDeger = 14;

        assertEquals(beklenenDeger, anlikDeger); //aldigi parametrelerinin degerlerini karsılastırır, birbirine eşitse test geçer

    }

    //!!!farkli bir ornek (toUpperCase)
    @Test
    protected void testUpperCase(){
        String actual = "Merhaba".toUpperCase(); //MERHABA
        String expected = "MERHABA";

        //Testim hata verdiğinde mesaj vermek istiyorsam;
        assertEquals(expected, actual, "UpperCase methodu duzgun calismadi");


    }

    @Test
    public void testToplama(){

        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1, sayi2);
        int beklenenDeger = 15;

        assertEquals(anlikDeger, beklenenDeger);

    }

    @Test
    public void testContains(){

        assertEquals(false,"Mirac".contains("z"));
    }

}
