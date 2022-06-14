package Cucumber.Cucumber_examles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebElement element,elementid ,elementname ,elementxpath,elementcss,elementlinkedtext,elementtagname;
	public static WebElement selectByValue,selectByIndex,selectByVisibleText;
	public static WebDriver getdriver(String browsernsme) {
	
		try {
			if (browsernsme.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOKUL RAJ\\eclipse-workspace\\Selenium\\chrome location\\chromedriver.exe");
				 driver = new ChromeDriver();
			} else {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void wait(int wait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public static  void findelements( String value,String text) {
		try {
			if (value.equalsIgnoreCase("id")) {
				 elementid = driver.findElement(By.id(text));
			} else if (value.equalsIgnoreCase("name")) {
				elementname = driver.findElement(By.name(text));
			} else if (value.equalsIgnoreCase("xpath")) {
				elementxpath = driver.findElement(By.xpath(text));
			} else if (value.equalsIgnoreCase("css")) {
				elementcss = driver.findElement(By.cssSelector(text));
			} else  if (value.equalsIgnoreCase("linkedtext")) {
				elementlinkedtext = driver.findElement(By.linkText(text));
			} else if (value.equalsIgnoreCase("tagname")) {
				elementtagname = driver.findElement(By.tagName(text));
			} else {

			}{

			} {

			} {

			} {

			} {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public static void click(WebElement element) {
		element.click();
	}
	public static void mousehold(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		}
	public static void move(WebElement element) {
		Actions b = new Actions(driver);
		b.contextClick(element).build().perform();
		}
	public static void dropdown(WebElement element, WebElement element1) {
		Actions c = new Actions(driver);
		c.dragAndDrop(element, element1).build().perform();
		}
	public static void clickhold(WebElement element) {
		Actions d = new Actions(driver);
		d.clickAndHold(element).build().perform();
		}
	public static void robotclass() throws AWTException {
	Robot e = new Robot();
	e.keyPress(KeyEvent.VK_DOWN);
	e.keyRelease(KeyEvent.VK_DOWN);
	e.keyPress(KeyEvent.VK_ENTER);
	e.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinateFile = new File(path);
		FileUtils.copyFileToDirectory(sourceFile, destinateFile);

	}
	public static void sendkeys(String value , WebElement element) {
		element.sendKeys(value);
		
		
	}
	public static void close() {
	driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	
	public static void back() {
		driver.navigate().back();
	}
	public static void forword() {
		driver.navigate().forward();
	}
	public static void gettext(WebElement element) {
		element.getText();
	}
	public static void gettagname(WebElement element) {
		element.getTagName();
	}
	public static void refersh() {
		driver.navigate().refresh();
	}
	public static void currenturl() {
		driver.getCurrentUrl();
	}public static void alert(String ok , String cancel) {
	if (ok.equalsIgnoreCase(ok)) {
		driver.switchTo().alert().accept();
		} else if (cancel.equalsIgnoreCase(cancel)) {
		driver.switchTo().alert().dismiss();
	} else {

	}
	{

	}
	}
	public static void alert(String ok , String cancel,String value) {
		if (ok.equalsIgnoreCase(ok)) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();
		} else if (cancel.equalsIgnoreCase(cancel)) {
			driver.switchTo().alert().dismiss();
		} else {

		} {

		}
	}
	
	public static void windowHandles() {
	Set<String> windowHandles = driver.getWindowHandles();
	for (String string : windowHandles) {
		String title = driver.switchTo().window(string).getTitle();
		
	}
	}
	
	public static void selection(WebElement element, String option,String value) {
		
		try {
			if (option.equalsIgnoreCase("byvalue")) {
				Select n = new Select(selectByValue);
				n.selectByValue(value);
			} else if (option.equalsIgnoreCase("int")) {
				Select o = new Select(selectByIndex);
				int parseInt = Integer.parseInt(option);
				o.selectByIndex(parseInt);
			} else  if (option.equalsIgnoreCase("byvisibletext")) {
				Select p = new Select(selectByVisibleText);
				p.selectByVisibleText(value);
			} else {

			}{
			}{
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
 
 


































}































	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
