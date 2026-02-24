package test.swag_labs;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "data")
  public void login_logout(String user, String pass) {
	  EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.close();
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
    };
  }
}
