package test.swag_labs;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class demoblaze_signup {
	@Test
	void display() throws IOException {
	FileReader f=new FileReader("C:\\Users\\AISHWARYA\\eclipse-workspace\\swag_labs\\base.properties");
	Properties pr=new Properties();
			pr.load(f);
			EdgeDriver driver=new EdgeDriver();
			driver.get(pr.getProperty("demoblaze"));
			driver.findElement(By.id("signin2")).click();
			driver.findElement(By.id("sign-username")).sendKeys(pr.getProperty("demo_uname"));
			driver.findElement(By.id("sign-password")).sendKeys(pr.getProperty("demo_pass"));

}
}