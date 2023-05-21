import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import java.util.Date;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class SmartBuy_Test_Project extends Parameters_SamrtBuy_Final_Test_Project {
	static String email8;
	static String Passwoard34;
	static double Expected_Price;
	static double Delivery_Price;
	static double Final_Price;

	@BeforeTest
	public void before_test() {
		driver.get(BasieURL);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void Sign_Up_Button() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/main/header/div[4]/div/nav/div/div[3]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		WebElement container = driver.findElement(By.xpath("//*[@id=\"cboxLoadedContent\"]"));

		container.findElement(By.className("btn-default")).click();

		WebElement title = driver.findElement(By.id("register.title"));

		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"register.firstName\"]"));
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"register.lastName\"]"));
		driver.findElement(By.id("registerGender")).sendKeys(Gender[randomly_gender]);

		if (randomly_gender == 1) {
			title.sendKeys(Title_Name_Womman[randomly_Womman]);
			firstName.sendKeys(first_name_for_womman[randomly_first_name_for_womman]);
			lastname.sendKeys(last_name[randomly_last_name]);

		} else if (randomly_gender == 0) {
			title.sendKeys(Title_Name_Men[randomly_Men]);
			firstName.sendKeys(first_name_for_men[randomly_first_name_for_men]);
			lastname.sendKeys(last_name[randomly_last_name]);
		}
		
		WebElement BirthOfDate = driver.findElement(By.id("dateOfBirth"));
		BirthOfDate.click();
		Thread.sleep(3000);
		WebElement MonthOfDate = driver.findElement(By.className("ui-datepicker-month"));
		Select MonthSelect = new Select(MonthOfDate);
		int randomly_month = rand.nextInt(0, 12);
		MonthSelect.selectByIndex(randomly_month);

		WebElement YearOfDate = driver.findElement(By.className("ui-datepicker-year"));
		Select YearSelect = new Select(YearOfDate);
		int randomly_Year = rand.nextInt(0, 50);
		YearSelect.selectByIndex(randomly_Year);

		List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table"));

		for (WebElement d : days) {
			d.click();
			break;
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[2]/div[2]/div[2]/button")).click();

		Thread.sleep(3000);

		WebElement email = driver.findElement(By.xpath("//*[@id=\"register.email\"]"));
		Random genataerandom = new Random();

		int randomlyemail = genataerandom.nextInt(1000);
		email8 = "username" + randomlyemail + "@gamil.com";
		email.sendKeys(email8);

		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));

		Random genaratepassworad = new Random();

		int randomlypassworad = genaratepassworad.nextInt(1000);
		Passwoard34 = "&&" + randomlypassworad + "asd";
		password.sendKeys(Passwoard34);

		System.out.println(password);
		WebElement confirm_passowrd = driver.findElement(By.xpath("//*[@id=\"register.checkPwd\"]"));

		confirm_passowrd.sendKeys("&&" + randomlypassworad + "asd");

		driver.findElement(By.id("termsandconditions")).click();

		Random rand2 = new Random();

		int myIndex2 = rand2.nextInt(0, 50);

		WebElement phonenumber = driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]"));

		Random genaratephonenumber = new Random();
		int randomlyphonenumber = genaratephonenumber.nextInt(100, 1000);
		int randomlyphonenumber2 = genaratephonenumber.nextInt(7, 9);
		phonenumber.sendKeys("07" + randomlyphonenumber2 + randomlyphonenumber + "6742");

		Thread.sleep(2000);

		WebElement Country = driver.findElement(By.xpath("//*[@id=\"countryMobileNumber\"]"));

		Country.sendKeys("Jordan");

		WebElement Nationality = driver.findElement(By.id("registerNationality"));
		Select nationality_select = new Select(Nationality);
		nationality_select.selectByIndex(myIndex2);

		

		WebElement UserProfile = driver
				.findElement(By.xpath("/html/body/main/header/div[4]/div/nav/div/div[3]/div/ul/li[2]/a"));

		UserProfile.click();
		Thread.sleep(1000);

		driver.navigate().to("https://smartbuy-me.com/smartbuystore/en//logout");

	}

	@Test(priority = 2)

	public void Login_Button() throws InterruptedException {

		WebElement user_button = driver
				.findElement(By.xpath("/html/body/main/header/div[4]/div/nav/div/div[3]/div/ul/li[3]/a"));

		user_button.click();

		Thread.sleep(3000);

		WebElement E_container = driver.findElement(By.xpath("//*[@id=\"cboxLoadedContent\"]"));

		E_container.findElement(By.id("j_username")).sendKeys("Rand4568@yahoo.com");

		E_container.findElement(By.id("j_password")).sendKeys("$$Yaseer000931");

		E_container.findElement(By.className("btn-primary")).click();
	}

	@Test(priority = 3)
	public void random_search() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Search_Bar = driver.findElement(By.id("js-site-search-input"));
		Search_Bar.sendKeys(SEARCH[k]);
		Thread.sleep(2000);
		Search_Bar.sendKeys(Keys.ENTER);
	}

	@Test(priority = 4)
	public void FindStoreButton() throws InterruptedException {
		Thread.sleep(2000);
		WebElement findstorebutton = driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[3]/a"));

		findstorebutton.click();
		Thread.sleep(2000);
		for (int i = 0; i < Locations.length; i++) {
			driver.findElement(By.xpath(Locations[i])).click();
			List<WebElement> d = driver
					.findElements(By.xpath("//*[@id=\"storeFinder\"]/div/div[2]/div/div/div[3]/div[2]/div[4]"));
			for (int p = 0; p < d.size(); p++) {
				System.out.println(d.get(p).findElement(By.tagName("dl")).getText());
				System.out.println(d.get(p).findElement(By.tagName("dd")).getText());
				System.out.println("---------------------------------------------");
			}

		}

	}

	@Test(priority = 5)
	public void AddToCart() throws InterruptedException {
		driver.navigate().to("https://smartbuy-me.com/smartbuystore/en/");

		for (int i = 0; i < 4; i++) {
			int T = rand.nextInt(0, 5);
			Thread.sleep(4000);
			WebElement Container = driver.findElement(By.xpath(ChartAdd[T]));
			Thread.sleep(1000);
			WebElement element = Container.findElement(By.xpath(itemsxpath[T]));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			Thread.sleep(2000);
			driver.findElement(By.id("addToCartButton")).click();
			driver.navigate().to("https://smartbuy-me.com/smartbuystore/en/");
			Thread.sleep(3000);

		}

	}

	@Test(priority = 6)
	public void CheackOut() throws InterruptedException, IOException {
		WebElement Container = driver.findElement(By.xpath("/html/body/main/header/div[4]/div/nav/div/div[3]/div/ul"));
		Container.findElement(By.className("js-mini-cart-link")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("mini-cart-checkout-button")).click();
		String ExpectedPrice = driver
				.findElement(By.xpath("/html/body/main/div[3]/div[1]/div[2]/div[4]/div/div[2]/div/div[1]/div[2]"))
				.getText();
		String SubTotal = ExpectedPrice.replace("JOD", "");

		driver.findElement(By.className("btn--continue-checkout")).click();
		WebElement location = driver.findElement(By.id("address.country"));
		int locationindex = rand.nextInt(0, 16);

		WebElement LocationContiner = driver
				.findElement(By.xpath("/html/body/main/div[3]/div[1]/div[1]/div[2]/div/div"));
		Select location_select = new Select(location);
		location_select.selectByIndex(locationindex);
		Thread.sleep(2000);
		int locationIndex = rand.nextInt(0, AddressLine.length);
		LocationContiner.findElement(By.xpath("//*[@id=\"us3-address\"]")).sendKeys(AddressLine[locationIndex]);

		WebElement Country = driver
				.findElement(By.xpath("//*[@id=\"i18nAddressForm\"]/div[10]/div/div/div/div/button"));
		Country.sendKeys("Jordan");
		Thread.sleep(1000);
		Country.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"addressSubmit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"deliveryMethodSubmit\"]")).click();

		WebElement Date = driver.findElement(By.xpath("//*[@id=\"timeSlotForm\"]/div[1]/div[2]/div/label"));
		Date.click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")).click();
		Thread.sleep(2000);
		String DeliveryPrice = driver
				.findElement(By.xpath("/html/body/main/div[3]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/span"))
				.getText();
		String DeliveryPrice1 = DeliveryPrice.replace("JOD", "");

		WebElement Next = driver.findElement(By.id("chooseDeliveryMethod_continue_button"));

		Next.click();

		WebElement Paymaent = driver

				.findElement(By.xpath("//*[@id=\"paymentMethodForm\"]/div[1]/div/ul/li[1]/div[1]/label"));

		Paymaent.click();

		Thread.sleep(2000);

		WebElement Next2 = driver.findElement(By.xpath("//*[@id=\"chooseDeliveryMethod_continue_button\"]"));

		Next2.click();

		String FinalPrice = driver

				.findElement(By.xpath("/html/body/main/div[3]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/span"))

				.getText();
		String FinalPrice1 = FinalPrice.replace("JOD", "");

		Delivery_Price = Double.parseDouble(DeliveryPrice1);
		System.out.println("SubTotal=" + SubTotal);
		Expected_Price = Double.parseDouble(SubTotal) + Delivery_Price;
		Final_Price = Double.parseDouble(FinalPrice1);
	}

	@Test(priority = 7)
	public void Assertion() throws InterruptedException {

		System.out.println("Expected_Price=" + Expected_Price);
		System.out.println("Delivery_Price=" + Delivery_Price);
		System.out.println("Final_Price=" + Final_Price);
		myAssertion.assertEquals(Final_Price, Expected_Price);

	}

	@Test(priority = 8)
	public void ScreenShot() throws IOException, InterruptedException {
		Date date = new Date();
		String updatedate = date.toString();
		String fixedDate = updatedate.replace(":", "-");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(".//" + fixedDate + ".png");
		FileUtils.copyFile(SrcFile, DestFile);

	}

	@AfterTest()
	public void aftertest() {

		myAssertion.assertAll();
	}

}
