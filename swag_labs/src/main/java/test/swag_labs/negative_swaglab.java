package test.swag_labs;



	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	
	import org.openqa.selenium.edge.EdgeDriver;
	
	import org.openqa.selenium.support.ui.Select;
	
	import org.testng.annotations.Test;

	public class negative_swaglab {
		EdgeDriver driver;
		@Test(priority=1)
		void launch() {
			driver=new EdgeDriver();
			driver.get("https://www.saucedemo.com/");	
			driver.manage().window().maximize();
		}
		

		@Test(priority=2)
		void login() throws InterruptedException
		{
			driver.findElement(By.name("user-name")).sendKeys("visual_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
		}
		
		@Test(priority=3)
		void logout()  {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			WebElement menu=driver.findElement(By.id("react-burger-menu-btn"));
			menu.click();
			
			
			
//			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.id("logout_sidebar_link")).click();

		}
		
		@Test(priority=4)
		void addtocart() throws InterruptedException
		{
			login();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//			driver.findElement(By.name("user-name")).sendKeys("standard_user");
//			driver.findElement(By.name("password")).sendKeys("secret_sauce");
//			driver.findElement(By.id("login-button")).click();
		
			
			Select select=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
			select.selectByValue("lohi");
			
			Select select1=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
			select1.selectByValue("hilo");
			
			Select select2=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
			select2.selectByValue("az");
			
			Select select3=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
			select3.selectByValue("za");
			
			
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
			driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
			
			driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
			
			driver.findElement(By.id("remove-sauce-labs-backpack")).click();
			
			driver.findElement(By.id("continue-shopping")).click();
		
		}
		

	@Test(priority=5)
	void addall() {

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();;
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		}

	@Test(priority=6)
	void checkoutcart()
	{
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

		
		driver.findElement(By.id("checkout")).click();
	}

	@Test(priority=7)
	void credentials()
	{
		driver.findElement(By.id("first-name")).sendKeys("john12");
		driver.findElement(By.id("last-name")).sendKeys("smith");
		driver.findElement(By.id("postal-code")).sendKeys("41325356");	

	}

	@Test(priority=8)
	void finalcheckout()
	{
		driver.findElement(By.id("cancel")).click();
		
		driver.findElement(By.id("checkout")).click();

		credentials();
		
		//driver.findElement(By.id("continue")).click();
	}

	@Test(priority=9)
	void finish()
	{
	  driver.findElement(By.id("cancel")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

		
		driver.findElement(By.id("checkout")).click();
		
		credentials();

		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
		
	}

	@Test(priority=10)
	void backhome()
	{
		driver.findElement(By.id("back-to-products")).click();
		
		logout();
	}
	}


