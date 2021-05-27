package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C02_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        /*
         - Driver acilana kadar bekle komutunu veriyoruz. Neden bunu yazma geregi duyduk ?
         - Cunku web elementinin yerini bulup oraya sendKeys icerisinde yazilani aktarmasi gerekiyor.
         Ornek olarak mail kismina nihattekiner@gmail.com yazdirmak istedik. Nereye bu adresi yazmasi gerektigini
         bulmasi gerekiyor, onun icin belirli bir sure verdik.
         - Eger sure vermezsek sendKeys method'u CALISMAZ.
         - Biz max 5 saniye bekle komutu verdik webelementini bulmasi icin eger bu sureden daha kisa surede
          webelementinin yerini bulursa daha fazla beklemez ve calismaya devam eder.
         - Sadece en basa yazilir baska yere yazilmaz.
         */

        driver.manage().window().maximize();
        /*
        1. http://a.testaddressbook.com/sign_in adresine gidiniz.
        2. email textbox,password textbox, and signin button elementlerini locate ediniz..
        3. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        4. Username : testtechproed@gmail.com
        5. Password : Test1234!
        6. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
         */
        driver.get("http://a.testaddressbook.com");
        /* <a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
         tagname : a
         attribute : id, class, data-test, href
         value : id = "sign-in",
                 class = "nav-item nav-link",
                 data-test = "sign-in",
                 href = "/sign_in"
         id bir lokosyon turudur. Bir webelementi id'sine bakarak bulabiliriz.
        */

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        // sign-in linkini bulur.
        signInLink.click();

        // Mail kutucugu icine sendKeys'de yazili olani gonderdik.
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testproqq@gmail.com");

        // Password kutucuguna sendKeys'de yazili olani gonderdik.
        WebElement passwordKutusu = driver.findElement(By.id("session_password"));
        passwordKutusu.sendKeys("TestSifrem01234");

        // ID'si olmadigi icin name'i aldik.
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        String  url= driver.getCurrentUrl();
        System.out.println(url);

        if(url.contains("a.testaddressbook.com")){
            System.out.println("url verileni iceriyor");
        } else {
            System.out.println("icermiyor");
        }
        String sayfaTitle = driver.getTitle();
        if (sayfaTitle.contains("address")) {
            System.out.println("Dogru sayfadasiniz");
        } else {
            System.out.println("Yanlis sayfadasiniz");
        }

        driver.close();


    }
}
