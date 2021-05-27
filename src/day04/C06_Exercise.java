package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C06_Exercise {
    public static void main(String[] args) {
        /*
        1. Bir class oluşturun : GoogleSearchTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        A.google web sayfasına gidin. https://www.google.com/
        b. Search(ara) “city bike”
        c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
        d. “Shopping” e tıklayın.
         */

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://google.com");

        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");
        // Yaziyi yazdirdiktan sonra ya enter'a basacaktik ya da googleda ara butonuna tiklayacatik.
        // Tiklamak icin bulup click method'u kullanabiliriz ama biz burada enter'lamak icin submit method'unu kullanacagiz.
        aramaKutusu.submit();

        WebElement goruntulemeSayisi = driver.findElement(By.id("result-stats"));
        String goruntulemesiYazisi = goruntulemeSayisi.getText();
        System.out.println("Goruntuleme yazisi : " + goruntulemesiYazisi);

        WebElement alisverisLinki = driver.findElement(By.className("hide-focus-ring"));
        alisverisLinki.click();

    }
}
