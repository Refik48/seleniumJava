package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nihat\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //driverı ekranı kaplıcakşekilde kullanalım
        //1-ilk önce google.com'a gidelim
        //2-sayfanın title'ını alalım ekrana yazdıralım
        //3-daha sonra youtube.com'a gidelim
        //4-sayfanın title'ını ve urlsini alıp ekrana yazdıralım
        //5-google.com'a geri gelelim ve sayfanın url'sini alıp ekrana yazdıralım
        //6-driverımızı kapatalım

        driver.manage().window().maximize();
        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        driver.navigate().to("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        String youtubeUrl = driver.getCurrentUrl();
        driver.navigate().back();
        String googleUrl = driver.getCurrentUrl();
        driver.close();

        System.out.println("Google Title : " + googleTitle);
        System.out.println("Youtube Title : " + youtubeTitle);
        System.out.println("Youtube Url : " + youtubeUrl);
        System.out.println("Google Url : " + googleUrl);
    }
}
