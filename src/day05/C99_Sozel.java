package day05;

public class C99_Sozel {
    /*
        By.xpath() :
        - 2 tur xpath vardir.
        1) Absolute : html/body/div[2]/div/div/div/div/div Kullanmayacagimiz xpath.
            Detayli yol gosterim. Eger herhangi bir div degisirse veya baska bir sey degisirse
            bizim yolu etkileyebilir ve hata almamiza sebep olabilir.
            /html/body/div/div/div/div/form/div/input = Bundan bir tane oldugu icin direkt nokta atisi yapar.
            Ama yukarda da belirttigim gibi yolda bir degisiklik olsa hata verebilir ve duzeltmek gerekebilir.
            //div/div/input = 1.sine gider.
        2) Relative :
            - //input[@class='form-control' and @type='email'] Her iki sarti sagladigini gosterir.
            - //input[@class='form-control' or @type='email'] En az bir sarti sagladigini gosterir.

            - Bir web sayfasinda gtml kodlarinda ctrl+f ile arama yaparak xpath arattigimizda
            (//input[@class='form-control'])[2]
            [//input[@class='form-control']][2]
            Bazen () icinde yazinca bazen de [] icinde yazinca kabul ediyor.
            Birden fazla form-control class'i var [] icinde [1] veya [2] seklinde yerlerini buluyorum.
            Kullanmayacagim bir yontem fakat bilgi bilgidir.

     */
}
