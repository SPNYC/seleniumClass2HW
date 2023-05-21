package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchingBrowser {
    /*
    navigate to google.com
     */
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new SafariDriver();
       driver.get("https://www.google.com");
       driver.manage().window().maximize();//maximize the window
      String  currentUrl=driver.getCurrentUrl();//get the current url
        System.out.println("the current url is "+currentUrl);//print on the console

        String title=driver.getTitle(); //get the title of the page
        System.out.println("the title of the page "+title);//print the title on the console
        Thread.sleep(5000);
        driver.quit(); //close the browser

    }
}
