package com.sample.core;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class BaseSetup 
{

    private DesiredCapabilities cap = new DesiredCapabilities();
    private static AppiumDriver<MobileElement> driver = null ;

    
    
    @BeforeClass
    public void setup()
    {
    	getDriver();
    }
    
    public AppiumDriver<MobileElement> getDriver()
    {
    	System.out.println("Inside initDriver method");
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.droidfoundry.calendar");
		cap.setCapability("appActivity", "com.droidfoundry.calendar.start.StartActivity");
		cap.setCapability("noReset", true);				
        try
        {
    		URL url = new URL("http://127.0.0.1:4723/wd/hub");
        	driver = new AppiumDriver<MobileElement>(url,cap);       	

        }
        catch (Exception ex) 
        {
            throw new RuntimeException("appium driver could not be initialised for device ");
        }        
        return driver;
    }


    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
