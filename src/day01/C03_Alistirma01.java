package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Alistirma01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //1. google.com gidin,
        // 2. Navigate to methodu ile amazon a gidin,
        // 3. Navigate back ile geri gelin,
        // 4. forward metodu ile tekrar ileri gidin,
        // 5. bulundugunuz sayfayı yenileyin,
        // 6. driveri kapatın.

        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
        // maximize ile fullscreen arasinda bir fark var.
        // Maximize yapilinca sayfa ekrani surekli kapliyor.
        // Fullscreen yapinca sadece o satir icin yapiyor. Sonraki satırda eski haline geri donuyor.


    }
}
