package day03;

public class C99_Sozel {
    /*
        - Webelement : Tiklayabildigimiz, inceleyebildigimiz her sey birer webelementtir.
        Bir web sayfasindaki web elemanlarini data type'i WebElement'tir.

        <input type="email" class="form-control" placeholder="Email"
        data-test="email" name="session[email]" id="session_email">

        - Tag Name : Bir web sayfasindaki herhangi bir webelementin html kodlarinda < isaretinden sonra
        gelen ilk kelime tag name'dir.
        Ornek : <input, <a, <span...

        - Attribute : Bir web sayfasinda herhangi bir webelementin html kodlarinda tag name'den sonra gelen
        devaminda "=" olan kelimelere denir.
        Ornek : class, type, name data-test, id....

        - Value : Bir web sayfasinda herhangi bir webelementin html kodlarinda attribute'lere karsilik gelen
        degerlere denir.
        Ornek : id attribute'nun value'su "session_email"dir.
        Ornek : type attribute'nun value'su "email"dir.

        findElement() : Web sayfasindaki istedigimiz elementi bulup bize getiriyor.
        FindElements() : Web sayfasindaki istedigimiz elementleri bulup bize getiriyor.
        sendKeys("gonderilecek yazi") : Web sayfasindaki webelementin icerisine yazi gondermek icin kullanilir.

        1) LOCATORS (Konum Bulucular)
        - Bir web sayfasindaki web elementlerin yerini bulmamiza yarar.
        - Bir web elementini bulabilmek icin 8 tane selenium locator vardir.
        a) id
        b) name
        c) className
        d) tagName
        e) linkText
        f) partialLinkText
        g) xpath => xpath yazmanin birden fazla yolu vardir.
        h) css => => path yazmanin birden fazla yolu vardir. yazmanin birden fazla yolu vardir.

        click() : Bir web sayfasindaki elemente tiklamizi saglar.

        Hangisi method'u kullanacagiz ? id'si yoksa name, name'i yoksa className... seklinde bir sira izleyerek,
        o web elementin yerini buluyoruz.

         <a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
         tagname : a
         attribute : id, class, data-test, href
         value : id = "sign-in",
                 class = "nav-item nav-link",
                 data-test = "sign-in",
                 href = "/sign_in"
         id bir lokosyon turudur. Bir webelementi id'sine bakarak bulabiliriz.

          Not : Sayfa Basligi (Title) bir web element degildir.
          HTML kodlarinin icindeki body kismindakiler bizim sayfamizin web elementleridir.


     */
}
