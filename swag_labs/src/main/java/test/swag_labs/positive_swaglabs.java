package test.swag_labs;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class swaglabs {
	EdgeDriver driver;
	@Test(priority=1)
	void launch() {
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");	
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	 public void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@Test(priority=3)
	void logout()  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement menu=driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		
		
		
//		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	@Test(priority=4)
	void menu() {
		login();
		//WebElement e1=driver.findElement(By.className("product_sort_container"));
		//e1.click();
		Select dropdown =new Select(driver.findElement(By.className("product_sort_container")));
		dropdown.selectByValue("za");
		
		Select dropdown1 =new Select(driver.findElement(By.className("product_sort_container")));
		dropdown1.selectByValue("lohi");
		
		Select dropdown2 =new Select(driver.findElement(By.className("product_sort_container")));
		dropdown2.selectByValue("hilo");
		
		Select dropdown3 =new Select(driver.findElement(By.className("product_sort_container")));
		dropdown3.selectByValue("az");
		
		}
	@Test(priority=5)
	void addcart() {
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack ")).click();
		
		driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
		
		driver.findElement(By.cssSelector("button#remove-sauce-labs-backpack")).click();
		
		driver.findElement(By.cssSelector("button#continue-shopping")).click();
		
		}
	@Test(priority=6)
	void addall() {
	
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		}
	@Test(priority=7)
	void checkout()
	{
		driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
		driver.findElement(By.cssSelector("button#checkout")).click();
		}
	@Test(priority=8)
	void credentials()
	{
		WebElement name=driver.findElement(By.id("first-name"));
		name.sendKeys("Aishwarya");
		
		WebElement lname=driver.findElement(By.id("last-name"));
		lname.sendKeys("Nandikole");
		//postal-code
		WebElement pincode=driver.findElement(By.id("postal-code"));
		pincode.sendKeys("413216");
		
	}
	@Test(priority=9)
	void finalchekout() {
		//cancel
		driver.findElement(By.cssSelector("button#cancel")).click();
		
		driver.findElement(By.cssSelector("button#checkout")).click();
		
		credentials();
		//continue
		
		driver.findElement(By.cssSelector("input#continue")).click();
	}
	@Test(priority=10)
	void finish() {
		//btn btn_secondary back btn_medium cart_cancel_link
		driver.findElement(By.name("cancel")).click();
		checkout();
		credentials();
		driver.findElement(By.cssSelector("input#continue")).click();
		
		//finish checkout
		driver.findElement(By.cssSelector("button#finish")).click();
		
		
		driver.findElement(By.cssSelector("button#back-to-products")).click();
		
		
	}
	@Test(priority=11)
    void media() {

		WebElement menu=driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	
//		driver.findElement(By.linkText("Twitter")).click();
//		
//		driver.findElement(By.linkText("Facebook")).click();
//		
//		driver.findElement(By.linkText("LinkedIn")).click();
	}


}
