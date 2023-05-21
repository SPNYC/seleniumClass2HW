package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LocatingElements {
    public static void main(String[] args) {
        WebDriver driver=new SafariDriver(); //instance
        driver.get("https://www.facebook.com");//facebook.com
      driver.manage().window().maximize();//maximize the window always
        //send some text in the email
        driver.findElement(By.id("email")).sendKeys("moazam@gmail.com");// send text to the element with sendKeys

        //send some text to the password field
        driver.findElement(By.name("pass")).sendKeys("abarakadabara");

        //print the url on console
        String url=driver.getCurrentUrl();
        System.out.println(url);

        //print title on the console
        String title = driver.getTitle();
        System.out.println(title);

        //confirm that title is Facebook-log in or sign up
        if(title.equals("Facebook-log in or sign up")){
            System.out.println("the tittle is correct");

        }
        else {
            System.out.println("the title is incorrect");
        }
        //close
        driver.quit();


    }
}
