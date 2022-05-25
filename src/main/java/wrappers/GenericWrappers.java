package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;


public class GenericWrappers extends Reporting implements Wrappers{

	public static RemoteWebDriver driver;
	
	public static Properties prop ;
	
	public void loadObjects() {
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void unloadObject() {
		prop=null;
	}
	
	
	public void invokeApp(String browser, String url){
		// TODO Auto-generated method stub
	try {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/gecko.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverserver.exe");
						driver = new InternetExplorerDriver();
			}
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	//System.out.println("The Browser "+browser+" is launched with given url "+url+" successfully");
		reportStep("The Browser " +browser+ " is launched with given URL " +url+ " successfully", "Pass");
		
	} catch (SessionNotCreatedException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Browser "+browser+" is not launched is due to session not created error");
		reportStep("The Browser " +browser+ " is not launched due to session not created error", "Fail");
	}catch (InvalidArgumentException e) {
		//System.err.println("The Browser "+browser+" is not launched as the url doesnt contain http/https");
		reportStep("The Browser " +browser+ " is not launched due to session not created error", "Fail");
	}catch (WebDriverException e) {
		//System.err.println("The Browser "+browser+" is not launched due to unknown error");
		reportStep("The Browser " +browser+ " is not launched due to session not created error", "Fail");
	}
	}
	

	public void enterById(String idValue, String data){
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The Element with id "+idValue+" is entered with data "+data);
			reportStep("The Element with id "+idValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+idValue+" is not found in the DOM");
			reportStep("The Element with id "+idValue+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idValue+" is not visible in the Application");
			reportStep("The Element with id "+idValue+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idValue+" is not interactable in the Application");
			reportStep("The Element with id "+idValue+" is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idValue+" is not stable in the Application");
			reportStep("The Element with id "+idValue+" is not stable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The Element with id "+idValue+" is not entered with data "+data+" due to unknown error", "Fail");
		}
		
		
	}

	public void enterByName(String nameValue, String data){
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The Element with name "+nameValue+" is entered with data" +data);
			reportStep("The Element with name "+nameValue+" is entered with data" +data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with name "+nameValue+" is not found in the DOM");
			reportStep("The Element with name "+nameValue+" is entered with data" +data, "Fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with name "+nameValue+" is not visible in the Application");
			reportStep("The Element with name "+nameValue+" is entered with data" +data, "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with name "+nameValue+" is not interactable in the Application");
			reportStep("The Element with name "+nameValue+" is entered with data" +data, "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the Appliaction");
			reportStep("The Element with name "+nameValue+" is entered with data" +data, "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The Element with name "+nameValue+" is entered with data" +data, "Fail");
		}
		
	}

	public void enterByXpath(String xpathValue, String data){
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The Element with name "+nameValue+" is entered with data" +data);
			reportStep("The Element with " +xpathValue+ " is entered with data " +data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpathValue+" is not found in the DOM");
			reportStep("The Element with xpath "+xpathValue+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathValue+" is not visible in the Application");
			reportStep("The Element with xpath "+xpathValue+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathValue+" is not interactable in the Application");
			reportStep("The Element with xpath "+xpathValue+" is not interactable in the Application","Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathValue+" is not stable in the Application");
			reportStep("The Element with xpath "+xpathValue+" is not stable in the Application","Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The Element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error","Fail");
		}
		
		
	}

	public void verifyTitle(String title){
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
			//System.out.println("The Title of the page "+actualTitle+"is matched with expected title "+title);
				reportStep("The Title of the page "+actualTitle+"is matched with expected title "+title, "Pass");
		}else {
			//System.err.println("The Title of the page "+actualTitle+" is not matched with expected title "+title);
			reportStep("The Title of the page "+actualTitle+" is not matched with expected title "+title, "Fail");
		}
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Title of the page "+title+" is not verified due to unknown error");
			reportStep("The Title of the page "+title+" is not verified due to unknown error", "Fail");
		}
		
	}

	public void verifyTextById(String id, String text){
		// TODO Auto-generated method stub
		String actualText = driver.findElementById(id).getText();
		try {
			if (actualText.equals(text)) {
				//System.out.println("The Element with id "+id+" is holding the text "+actualText+" is matched with expected text" +text);
				reportStep("The Element with id "+id+" is holding the text "+actualText+" is matched with expected text" +text, "Pass");
			}else {
				//System.err.println("The Element with "+id+" is holding the text "+actualText+" is not matched with expected text" +text);
				reportStep("The Element with "+id+" is holding the text "+actualText+" is not matched with expected text" +text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not visible in the Application");
			reportStep("The Element with id "+id+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not interactable in the Application");
			reportStep("The Element with id "+id+" is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+id+" is not entered with data "+actualText+" due to unknown error");
			reportStep("The Element with xpath "+id+" is not entered with data "+actualText+" due to unknown error", "Fail");
		}
		
	}

	public void verifyTextByXpath(String xpath, String text){
		// TODO Auto-generated method stub
		try {
			String actualText= driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) {
				//System.out.println("The element with xpath" +xpath+ "is holding the text "+actualText+" is matched with the expected text" +text);
				reportStep("The element with xpath" +xpath+ "is holding the text "+actualText+" is matched with the expected text" +text, "Pass");
			}else
			{
				//System.err.println("The element with xpath" +xpath+ "is holding the text "+actualText+" is not matched with the expected text" +text);
				reportStep("The element with xpath" +xpath+ "is holding the text "+actualText+" is not matched with the expected text" +text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpath+" is not found in the DOM");
			reportStep("The Element with xpath "+xpath+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpath+" is not visible in the Application");
			reportStep("The Element with xpath "+xpath+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpath+" is not interactable in the Application");
			reportStep("The Element with xpath "+xpath+" is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpath+" is not stable in the Application");
			reportStep("The Element with xpath "+xpath+" is not stable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpath+" is not verified with "+text+" due to unknown error");
			reportStep("The Element with xpath "+xpath+" is not verified with "+text+" due to unknown error", "Fail");
		}
		
	}

	public void verifyTextContainsByXpath(String xpath, String text){
		// TODO Auto-generated method stub
		try {
			String actualText= driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) {
				//System.out.println("The element with xpath" +xpath+ "contains the text" +actualText+ "is verified with the expected text" +text);
				reportStep("The element with xpath" +xpath+ "contains the text" +actualText+ "is verified with the expected text" +text, "Pass");
			} else 
			{
				//System.err.println("The element with xpath" +xpath+ "contains the text" +actualText+ "is not verified with the expected text" +text);
				reportStep("The element with xpath" +xpath+ "contains the text" +actualText+ "is not verified with the expected text" +text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpath+" is not found in the DOM");
			reportStep("The Element with xpath "+xpath+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpath+" is not visible in the Application");
			reportStep("The Element with xpath "+xpath+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpath+" is not interactable in the Application");
			reportStep("The Element with xpath "+xpath+" is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpath+" is not stable in the Application");
			reportStep("The Element with xpath "+xpath+" is not stable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpath+" is not verified with "+text+" due to unknown error");
			reportStep("The Element with xpath "+xpath+" is not verified with "+text+" due to unknown error", "Fail");
		}

	}

	public void clickById(String id){
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id" +id+ "is clickable");
			reportStep("The element with id" +id+ "is clickable", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not visible in the Application");
			reportStep("The Element with id "+id+" is not visible in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not stable in the Application");
			reportStep("The Element with id "+id+" is not stable in the Application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not clickbale in the Application");
			reportStep("The Element with id "+id+" is not clickbale in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not interactable in the Application");
			reportStep("The Element with id "+id+" is not interactable in the Application", "Fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not launched since the URL doesnt contain http/https");
			reportStep("The Element with id "+id+" is not launched since the URL doesnt contain http/https", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not verified with "+id+" is not clickable due to unknown error");
			reportStep("The Element with id "+id+" is not verified with "+id+" is not clickable due to unknown error", "Fail");
		}
		
	}

	public void clickByClassName(String classVal){
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with classname "+classVal+" is clickable");
			reportStep("The element with classname "+classVal+" is clickable", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with classname "+classVal+" is not found in the DOM");
			reportStep("The Element with classname "+classVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with classname "+classVal+" is not visible in the Application");
			reportStep("The Element with classname "+classVal+" is not visible in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with classname "+classVal+" is not stable in the Application");
			reportStep("The Element with classname "+classVal+" is not stable in the Application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with classname "+classVal+" is not clickbale in the Application");
			reportStep("The Element with classname "+classVal+" is not clickbale in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with classname "+classVal+" is not interactable in the Application");
			reportStep("The Element with classname "+classVal+" is not interactable in the Application", "Fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The Element with classname "+classVal+" is not launched since the URL doesnt contain http/https");
			reportStep("The Element with classname "+classVal+" is not launched since the URL doesnt contain http/https", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with classname "+classVal+" is not clickable due to unknown error");
			reportStep("The Element with classname "+classVal+" is not clickable due to unknown error", "Fail");
		}
		
	}

	public void clickByName(String name){
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The Element with name" +name+ "is clickable");
			reportStep("The Element with name" +name+ "is clickable", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with name "+name+" is not found in the DOM");
			reportStep("The Element with name "+name+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with name "+name+" is not visible in the Application");
			reportStep("The Element with name "+name+" is not visible in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with name "+name+" is not stable in the Application");
			reportStep("The Element with name "+name+" is not stable in the Application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with name "+name+" is not clickbale in the Application");
			reportStep("The Element with name "+name+" is not clickbale in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with name "+name+" is not interactable in the Application");
			reportStep("The Element with name "+name+" is not interactable in the Application", "Fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The Element with name "+name+" is not launched since the URL doesnt contain http/https");
			reportStep("The Element with name "+name+" is not launched since the URL doesnt contain http/https", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with name "+name+" is not clickable due to unknown error");
			reportStep("The Element with name "+name+" is not clickable due to unknown error", "Fail");
			
		}
	}

	public void clickByLink(String name){
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with Linktext" +name+ "is clickable");
			reportStep("The Element with Linktext" +name+ "is clickable", "Pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Linktext "+name+" is not found in the DOM");
			reportStep("The Element with Linktext "+name+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not visible in the Application");
			reportStep("The Element with Linktext "+name+" is not visible in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not stable in the Application");
			reportStep("The Element with Linktext "+name+" is not stable in the Application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not clickbale in the Application");
			reportStep("The Element with Linktext "+name+" is not clickbale in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not interactable in the Application");
			reportStep("The Element with Linktext "+name+" is not interactable in the Application", "Fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not launched since the URL doesnt contain http/https");
			reportStep("The Element with Linktext "+name+" is not launched since the URL doesnt contain http/https", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not clickable due to unknown error");
			reportStep("The Element with Linktext "+name+" is not clickable due to unknown error", "Fail");
			
		}

	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with Linktext" +name+ "is clickable");
			reportStep("The Element with Linktext" +name+ "is clickable", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Linktext "+name+" is not found in the DOM");
			reportStep("The Element with Linktext "+name+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not visible in the Application");
			reportStep("The Element with Linktext "+name+" is not visible in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not stable in the Application");
			reportStep("The Element with Linktext "+name+" is not stable in the Application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not clickbale in the Application");
			reportStep("The Element with Linktext "+name+" is not clickbale in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not interactable in the Application");
			reportStep("The Element with Linktext "+name+" is not interactable in the Application", "Fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not launched since the URL doesnt contain http/https");
			reportStep("The Element with Linktext "+name+" is not launched since the URL doesnt contain http/https", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with Linktext "+name+" is not clickable due to unknown error");
			reportStep("The Element with Linktext "+name+" is not clickable due to unknown error", "Fail");
			
		}

	}

	public void clickByXpath(String xpathVal){
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with xpath" +xpathVal+ "is clickable");
			reportStep("The Element with xpath" +xpathVal+ "is clickable", "Pass");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with xpath "+xpathVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not visible in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not visible in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not stable in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not stable in the Application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not clickbale in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not clickbale in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not interactable in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not interactable in the Application", "Fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not launched since the URL doesnt contain http/https");
			reportStep("The Element with xpath "+xpathVal+" is not launched since the URL doesnt contain http/https", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not clickable due to unknown error");
			reportStep("The Element with xpath "+xpathVal+" is not clickable due to unknown error", "Fail");
			
		}

	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with xpath" +xpathVal+ "is clickable");
			reportStep("The Element with xpath" +xpathVal+ "is clickable", "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with xpath "+xpathVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not visible in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not visible in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not stable in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not stable in the Application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not clickbale in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not clickbale in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not interactable in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not interactable in the Application", "Fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not launched since the URL doesnt contain http/https");
			reportStep("The Element with xpath "+xpathVal+" is not launched since the URL doesnt contain http/https", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not clickable due to unknown error");
			reportStep("The Element with xpath "+xpathVal+" is not clickable due to unknown error", "Fail");
		}

	}

	public String getTextById(String idVal){
		// TODO Auto-generated method stub
		try {
			String DisplayText = driver.findElementById(idVal).getText();
			//System.out.println("The Element with id" +idVal+ "is gathered with displaytext" +DisplayText);
			reportStep("The Element with id" +idVal+ "is gathered with displaytext" +DisplayText, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+idVal+" is not found in the DOM");
			reportStep("The element with Id " +idVal+ " is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idVal+" is not visible in the Application");
			reportStep("The Element with id" +idVal+ " is gathered with displaytext", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idVal+" is not interactable in the Application");
			reportStep("The Element with id" +idVal+ "is gathered with displaytext", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idVal+" is not stable in the Application");
			reportStep("The Element with id" +idVal+ "is gathered with displaytext", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idVal+" is not gathered due to unknown error");
			reportStep("The Element with id" +idVal+ "is gathered with displaytext", "Fail");
			
		}

		return getTextById(idVal);
	}

	public String getTextByXpath(String xpathVal){
		// TODO Auto-generated method stub
		try {
			String ScreenText = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The Element with xpath" +xpathVal+ "is gathered with screentext" +ScreenText);
			reportStep("The Element with xpath" +xpathVal+ "is gathered with screentext" +ScreenText, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with xpath "+xpathVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not visible in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not interactable in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not stable in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not stable in the Application", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not gathered due to unknown error");
			reportStep("The Element with xpath "+xpathVal+" is not gathered due to unknown error", "Fail");
		}

		return getTextByXpath(xpathVal);
	}

	public void selectVisibileTextById(String id, String value){
		// TODO Auto-generated method stub
		try {
			WebElement selDropdown = driver.findElementById(id);
			Select Dropdownchoose = new Select(selDropdown);
			Dropdownchoose.selectByVisibleText(value);
			//System.out.println("The Element with Select dropdown" +id+ "is selected by VisibleText" +value);
			reportStep("The Element with Select dropdown" +id+ "is selected by VisibleText" +value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Select dropdown "+id+" is not found in the DOM");
			reportStep("The Element with Select dropdown "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+id+" is not selected by Index" +value);
			reportStep("The Element with Select dropdown "+id+" is not selected by Index" +value, "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+id+" is not interactable in the Application");
			reportStep("The Element with Select dropdown "+id+" is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+id+" is not stable in the Application");
			reportStep("The Element with Select dropdown "+id+" is not stable in the Application", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+id+" is not selectable due to unknown error");
			reportStep("The Element with Select dropdown "+id+" is not selectable due to unknown error", "Fail");
			
		}

	}

	public void selectIndexById(String id, int value){
		// TODO Auto-generated method stub
		try {
			WebElement pageDropdown = driver.findElementById(id);
			Select Dropdownchoose = new Select(pageDropdown);
			Dropdownchoose.selectByIndex(value);
			//System.out.println("The Element with Select dropdown" +id+ "is selected by Index" +value);
			reportStep("The Element with Select dropdown" +id+ "is selected by Index" +value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Select dropdown "+id+" is not found in the DOM");
			reportStep("The Element with Select dropdown "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+id+" is not selected by Index" +value);
			reportStep("The Element with Select dropdown "+id+" is not selected by Index" +value, "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+id+" is not interactable in the Application");
			reportStep("The Element with Select dropdown "+id+" is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+id+" is not stable in the Application");
			reportStep("The Element with Select dropdown "+id+" is not stable in the Application", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+id+" is not gathered due to unknown error");
			reportStep("The Element with Select dropdown "+id+" is not gathered due to unknown error", "Fail");
			
		}

	}

	public void switchToParentWindow(){
		// TODO Auto-generated method stub
		try {
			Set<String> windows = driver.getWindowHandles();
			for (String eachId : windows) {
				driver.switchTo().window(eachId);
				//System.out.println("The Browser switched to parent window");
				reportStep("The Browser switched to parent window", "Pass");
				break;
		}
		}catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The browser could not switch to parent window since the window is not available");
			reportStep("The browser could not switch to parent window since the window is not available", "Fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The browser could not switch to parent window due to unexpected alerts");
			reportStep("The browser could not switch to parent window due to unexpected alerts", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser could not switch to parent window due to unknown error");
			reportStep("The browser could not switch to parent window due to unknown error", "Fail");
		}
		
	}

	public void switchToLastWindow(){
		// TODO Auto-generated method stub
		try {
			Set<String> allwindowafter = driver.getWindowHandles();	
			for (String eachID : allwindowafter) {
				driver.switchTo().window(eachID);		
			}
			//System.out.println("The Browser has switched to Last window");
			reportStep("The Browser has switched to Last window", "Pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser could not switch to last window since SessionID is not created");
			reportStep("The browser could not switch to last window since SessionID is not created", "Fail");
		}catch (NoSuchWindowException e) {
			// TODO: handle exception
			//System.err.println("The browser could not switch to last window since the window is not available");
			reportStep("The browser could not switch to last window since the window is not available", "Fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The browser could not switch to last window due to unexpected alerts");
			reportStep("The browser could not switch to last window due to unexpected alerts", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser could not switch to last window due to unknown error");
			reportStep("The browser could not switch to last window due to unknown error", "Fail");
		}
	}

	public void acceptAlert(){
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The displayed alert has been accepted");
			reportStep("The displayed alert has been accepted", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert opened");
			reportStep("There is no alert opened", "Fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("Accepting alert is aborted due to unexpected alerts");
			reportStep("Accepting alert is aborted due to unexpected alerts", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Accepting alert is aborted dur to unknown error");
			reportStep("Accepting alert is aborted dur to unknown error", "Fail");
		}

	}

	public void dismissAlert(){
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The displayed alert has been dismissed");
			reportStep("The displayed alert has been dismissed", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert opened");
			reportStep("There is no alert opened", "Fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("Dismissing alert is aborted due to unexpected alerts");
			reportStep("Dismissing alert is aborted due to unexpected alerts", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Dismissing alert is aborted due to unknown error");
			reportStep("Dismissing alert is aborted due to unknown error", "Fail");
			
		}
	}

	public String getAlertText(){
		// TODO Auto-generated method stub
		try {
			String AlertText = driver.switchTo().alert().getText();
			//System.out.println("The Alert text " +AlertText+ "is displayed");
			reportStep("The Alert text " +AlertText+ "is displayed", "Pass");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element for Alert text is not found in the DOM");
			reportStep("The Element for Alert text is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element for Alert text is not visible in the Application");
			reportStep("The Element for Alert text is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element for Alert text is not interactable in the Application");
			reportStep("The Element for Alert text is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element for Alert text is not stable in the Application");
			reportStep("The Element for Alert text is not stable in the Application", "Fail");
		}
		catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("No Alert found");
			reportStep("No Alert found", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Alert text is not displayed due to unknown error");
			reportStep("The Alert text is not displayed due to unknown error", "Fail");
		}

		return getAlertText();
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		long number =0;
			try {
				
				number = (long) (Math.floor(Math.random()*100000000)+100000);
				
				File tmp = driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("./reports/screenshots/"+number+".png");
				FileUtils.copyFile(tmp, dest);
				//System.out.println("The Screenshot has been successfully taken and stored in" +dest);
				///reportStep("The Screenshot has been successfully taken and stored in" +dest, "Pass");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				//System.err.println("The Screenshot fformat is not supported due to unknown error");
				reportStep("The Screenshot fformat is not supported due to unknown error", "Fail");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//System.err.println("The Screenshot format has not taken due to IOException error");
				//reportStep("The Screenshot format has not taken due to IOException error", "Fail");
			}
		 return number;
	}

	public void closeBrowser(){
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The active window is closed");
			reportStep("The active window is closed", "Pass", false);
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Active window is not closed due to unexpected alert");
			reportStep("The Active window is not closed due to unexpected alert", "Fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Active windowss is not closed due to unknown error");
			reportStep("The Active windowss is not closed due to unknown error", "Fail", false);
		}

	}

	public void closeAllBrowsers(){
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All the browsers are closed");
			reportStep("All the browsers are closed", "Pass", false);
	
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.println("All the browsers is not closed due to unexpected alert");
			reportStep("All the browsers is not closed due to unexpected alert", "Fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("All the browsers is not closed due to unknown error");
			reportStep("All the browsers is not closed due to unknown error", "Fail", false);
		}
		

	}


	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement valueDropdown = driver.findElementById(id);
			
			Select valueDropdown1 = new Select(valueDropdown);
			
			valueDropdown1.selectByValue(value);
			
			//System.out.println("The Element with Select dropdown "+id+" is selected by Value " +value);
			reportStep("The Element with Select dropdown "+id+" is selected by Value " +value, "Pass");
		} catch (NoSuchElementException  e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Select dropdown "+id+" is not found in the DOM");
			reportStep("The element with Select dropdown "+id+" is not found in the DOM", "Fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Select dropdown "+id+" is not interactable in the Application");
			reportStep("The element with Select dropdown "+id+" is not interactable in the Application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with Select dropdown "+id+" is not selected by Value " +value);
			reportStep("The element with Select dropdown "+id+" is not selected by Value " +value, "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Select dropdown "+id+" is not stable in the Applicaion");
			reportStep("The element with Select dropdown "+id+" is not stable in the Applicaion", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Select dropdown "+id+" is not selectable due to unknown error");
			reportStep("The element with Select dropdown "+id+" is not selectable due to unknown error", "Fail");
		} 	

		
	}


	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement pageDropdown1 = driver.findElementByXPath(xpath);
			
			Select Dropdownchoose1 = new Select(pageDropdown1);
			
			Dropdownchoose1.selectByVisibleText(value);
			
			//System.out.println("The Element with Select dropdown "+xpath+" is selected by VisibleText "+value);
			reportStep("The Element with Select dropdown "+xpath+" is selected by VisibleText "+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Select dropdown "+xpath+" is not found in the DOM");
			reportStep("The Element with Select dropdown "+xpath+" is not found in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not interactable in the Application");
			reportStep("The Element with Select dropdown "+xpath+" is not interactable in the Application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not selected by VisibleText "+value);
			reportStep("The Element with Select dropdown "+xpath+" is not selected by VisibleText "+value, "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not stable in the Application");
			reportStep("The Element with Select dropdown "+xpath+" is not stable in the Application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not selectable due to unknown error");
			reportStep("The Element with Select dropdown "+xpath+" is not selectable due to unknown error", "Fail");
		} 

		
	}


	public void selectIndexByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement pageDropdown11 = driver.findElementByXPath(xpath);
			
			Select Dropdownchoose11 = new Select(pageDropdown11);
			
			Dropdownchoose11.selectByIndex(value);
			
			//System.out.println("The Element with Select dropdown "+xpath+" is selected by Index " +value);
			reportStep("The Element with Select dropdown "+xpath+" is selected by Index " +value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Select dropdown "+xpath+" is not found in the DOM");
			reportStep("The Element with Select dropdown "+xpath+" is not found in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not interactable in the Application");
			reportStep("The Element with Select dropdown "+xpath+" is not interactable in the Application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not selected by Index " +value);
			reportStep("The Element with Select dropdown "+xpath+" is not selected by Index " +value, "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not stable in the Application");
			reportStep("The Element with Select dropdown "+xpath+" is not stable in the Application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not selectable due to unknown error");
			reportStep("The Element with Select dropdown "+xpath+" is not selectable due to unknown error", "Fail");
		} 

	}


	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement pageDropdown2 = driver.findElementByXPath(xpath);
			
			Select Dropdownchoose2 = new Select(pageDropdown2);
			
			Dropdownchoose2.selectByValue(value);
			
			//System.out.println("The Element with Select dropdown "+xpath+" is selected by Value" +value);
			reportStep("The Element with Select dropdown "+xpath+" is selected by Value" +value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with Select dropdown "+xpath+" is not found in the DOM");
			reportStep("The Element with Select dropdown "+xpath+" is not found in the DOM", "Pass");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not interactable in the Application");
			reportStep("The Element with Select dropdown "+xpath+" is not interactable in the Application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not selected by Value" +value);
			reportStep("The Element with Select dropdown "+xpath+" is not selected by Value" +value, "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not stable in the Application");
			reportStep("The Element with Select dropdown "+xpath+" is not stable in the Application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with Select dropdown "+xpath+" is not selectable due to unknown error");
			reportStep("The Element with Select dropdown "+xpath+" is not selectable due to unknown error", "Fail");
		} 

		

	}


	public void PAGEDOWNByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).sendKeys(Keys.PAGE_DOWN);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with xpath "+xpathVal+" is not found in the DOM", "Pass");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not visible in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not visible in the Application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpathVal+" is not interactable in Appliction");
			reportStep("The Element with xpath "+xpathVal+" is not interactable in Appliction", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not stable in Application");
			reportStep("The Element with xpath "+xpathVal+" is not stable in Application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath "+xpathVal+" is not scrolled down due to unknown error");
			reportStep("The Element with xpath "+xpathVal+" is not scrolled down due to unknown error", "Fail");
		}

		}

		


	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void switchToFrameByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			WebElement newFrame = driver.findElementByXPath(xpathVal);
			
			driver.switchTo().frame(newFrame);
			
			//System.out.println("The control is switched to "+newFrame+" successfully");
			reportStep("The control is switched to "+newFrame+" successfully", "Pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
		//System.err.println("The control is not switched due to No-Frames Available");
			reportStep("The control is not switched due to No-Frames Available", "Fail");
		
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The Element with xpath is not found in DOM");
			reportStep("The Element with xpath is not found in DOM", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The control is not switched due to unknown error");
			reportStep("The control is not switched due to unknown error", "Fail");

		}


	}


	public void switchToMainFrame() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().defaultContent();
			
			//System.out.println("The control is switched to Mainframe successfully");
			reportStep("The control is switched to Mainframe successfully", "Pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
		//System.err.println("The control is not switched due to No-Frames Available");
			reportStep("The control is not switched due to No-Frames Available", "Fail");
		
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not found in DOM");
			reportStep("The element with xpath is not found in DOM", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The control is not switched due to unknown error");
			reportStep("The control is not switched due to unknown error", "Fail");

		}


		
	}


	public void refresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
			
			//System.out.println("The page is refreshed successfully");
			reportStep("The page is refreshed successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page does not refreshed due to unknown error");
			reportStep("The page does not refreshed due to unknown error", "Fail");

		}


	}


	public void alertsByswitchtoAlert(String data) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(data);
			
			//System.out.println("The data " +data+ " is successfully entered in alert");
			reportStep("The data " +data+ " is successfully entered in alert", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The data is not entered due to No-Alrtes Available");
			reportStep("The data is not entered due to No-Alrtes Available", "Fail");

		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The data is not entered due to unknown error");
			reportStep("The data is not entered due to unknown error", "Fail");
	
		}


		
	}


	public void mouseHoverByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			WebElement Element=driver.findElementByXPath(xpathVal);
			builder.moveToElement(Element).perform();
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath is not found in the DOM");
			reportStep("The element with Xpath is not found in the DOM", "Fail");
		}
	catch(ElementNotVisibleException e) {
		// TODO: handle exception
				//System.err.println("The element with Xpath "+xpathVal+" is not visible in the Application");
		reportStep("The element with Xpath "+xpathVal+" is not visible in the Application", "Fail");
	}
			catch(ElementNotInteractableException e) {
				// TODO: handle exception
						//System.err.println("The element with Xpath "+xpathVal+" is not interactable in the Application");
				reportStep("The element with Xpath "+xpathVal+" is not interactable in the Application", "Fail");
			
		}catch(StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpathVal+" is not stable in the Application");
			reportStep("The element with Xpath "+xpathVal+" is not stable in the Application", "Fail");

	}catch(WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath is not found dur to unknown error");
		reportStep("The element with xpath is not found dur to unknown error", "Fail");

	}
		}


}
