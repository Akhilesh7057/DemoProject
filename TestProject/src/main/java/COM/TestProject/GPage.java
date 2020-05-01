package COM.TestProject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class GPage {


    public WebDriver driver;


    By Search = By.name("q");
    By Selenium= By.className("LC20lb DKV0Md");
    //   By Child = By.xpath("//tr/td[1]");

    public GPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Search(String SearchText) throws IOException, InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Actions action = new Actions(driver);
        //      js.executeScript("document.querySelector('div.a4bIc > input').click()",0);
        WebElement ser = driver.findElement(Search);
        ser.click();
        Thread.sleep(2000);
     //   action.sendKeys(ser, Keys.chord(Keys.SHIFT, "selenium")).perform()
        WebElement Sel = driver.findElement(Selenium);
        Sel.click();
        
        

    }
    
    

}