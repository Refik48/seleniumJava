package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Exercise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
         /*
        1. Create a class : Day2Review
        2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının "youtube"
        olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda
        yazdirin.
        3. Sayfa URL'sinin "youtube" içerip içermediğini(contains) doğrulayın, içermiyorsa doğru
        URL'yi yazdırın.
        4. Daha sonra Navigate to https://www.amazon.com/
        5. Navigate back to youtube
        6. Refresh the page
        7. Navigate forward to amazon
        8. Maximize the window
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa
        doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        11.Quit the browser
         */

        driver.get("http://youtube.com");

        String youtubeTitle = driver.getTitle();
        System.out.println("Youtube Title : " + youtubeTitle);
        if (youtubeTitle.toLowerCase().contains("youtube")) {
            System.out.println("Youtube Title'in icinde youtube kelimesi geciyor");
        } else {
            System.out.println("Youtube Title'in icinde youtube kelimesi gecmiyor. Youtube Title : " + youtubeTitle);
        }

        String youtubeUrl = driver.getCurrentUrl();
        if (youtubeUrl.toLowerCase().contains("youtube")) {
            System.out.println("Youtube URL youtube kelimesi geciyor");
        } else {
            System.out.println("Youtube URL youtube kelimesi gecmiyor. Youtube Title : " + youtubeUrl);
        }

        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String amazonTitle = driver.getTitle();
        if (amazonTitle.toLowerCase().contains("amazon")) {
            System.out.println("Amazon Title'in icinde amazon kelimesi geciyor");
        } else {
            System.out.println("Amazon Title'in icinde amazon kelimesi gecmiyor. Amazon Title : " + amazonTitle);
        }

        String amazonUrl = driver.getCurrentUrl();
        if (youtubeUrl.equals("https://www.amazon.com/")) {
            System.out.println("Amazon URL https://www.amazon.com'dur");
        } else {
            System.out.println("Amazon URL https://www.amazon.com/ degildir. Amazon Title : " + amazonUrl);
        }
        driver.quit();
    }
}
