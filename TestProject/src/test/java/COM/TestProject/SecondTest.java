/**
 * 
 */
package COM.TestProject;

import java.io.IOException;

import org.testng.annotations.Test;

/**
 * @author A842452
 *
 */
public class SecondTest extends BasePage {
	
    @Test
    public void FTest() throws IOException, Throwable {
        GPage GP = new GPage(driver);
        GP.Search("Selenium");
    }


}
