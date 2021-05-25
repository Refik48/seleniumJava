package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class C05_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        /*
        1-youtube.com'a gidin
        2-sayfa başlığı video kelimesi içeriyor mu ona bakın
        3-driver'ı kapatın
        */
        driver.manage().window().maximize();
        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        if (youtubeTitle.toUpperCase().contains("video")) {
            System.out.println(youtubeTitle + " 'da video kelimesi geciyor.");
        } else {
            System.out.println(youtubeTitle + " 'da video kelimesi gecmiyor.");
            // Youtube title'da video kelime gecmedigi icin burasi calisti.
        }
        driver.quit();
    }
}
