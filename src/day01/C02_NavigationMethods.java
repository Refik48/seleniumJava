package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // maximize ile fullscreen arasinda bir fark var.
        // Maximize yapilinca sayfa ekrani surekli kapliyor.
        // Fullscreen yapinca sadece o satir icin yapiyor. Sonraki satırda eski haline geri donuyor.

        driver.get("http://google.com");

        // navigate anlam olarak yonlendirici demektir. Bu method uzerinden yonlendirmeler yapacagiz.
        driver.navigate().to("http://amazon.com");
        // navigate method icerisine URL veya String yazabiliyoruz.
        // get ile navigate arasinda tek fark get method'u daha hizli calisir.

        driver.navigate().back(); // Var olan adresten geriye gel demek anlaminda kullanilan method.

        driver.navigate().forward(); // Oncesine donmus oldugumuz sayfadan ileriye eski haline gider.

        driver.close();

        driver.navigate().refresh(); // bulundugu sayfayi yeniler




    }
}
