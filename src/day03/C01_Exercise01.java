package day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Exercise01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        /*
       1. chromeDriver i kullanarak facebook' a gidin ve sayfa basliginin " facebook" olup olmadigini dogrulayin
          degilse dogru basligi( actual title ) yazdirin
       2. sayfa URL' sinin facebook icerip icermedigini (contains),
       degilse dogru URL; yi(actual URL ) yazdirin.
       3. sonra Navigate to http:\\www.walmart.com
       4. Walmart sayfa basligignin " Walmart.com" icerip icermedigini dogrulayin
       5. navigate back to facebook
       6. sayfayi refresh yapin
       7. maximize the window yapin
       8. close the browser
        */

        driver.get("http://facebook.com");
        String faceTitle = driver.getTitle();
        if (faceTitle.toLowerCase().contains("facebook")) {
            System.out.println("Facebook Title'inda Facebook yazisi bulunuyor. Facebook Title : " + faceTitle);
        } else {
            System.out.println("Facebook Title'inda Facebook yazisi bulunmuyor. Facebook Title : " + faceTitle);
        }

        String faceUrl = driver.getCurrentUrl();
        if (faceUrl.toLowerCase().contains("facebook")) {
            System.out.println("Facebook URL'sinde Facebook yazisi bulunuyor. Facebook URL : " + faceUrl);
        } else {
            System.out.println("Facebook URL'sinde Facebook yazisi bulunmuyor. Facebook URL : " + faceUrl);
        }

        driver.navigate().to("http://walmart.com");
        String walmartTitle = driver.getTitle();
        if (walmartTitle.toLowerCase().contains("walmart.com")) {
            System.out.println("Walmart Title'inda walmart.com yazisi bulunuyor. Walmart Title : " + walmartTitle);
        } else {
            System.out.println("Walmart Title'inda walmart.com yazisi bulunmuyor. Walmart Title : " + walmartTitle);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
    }
}
