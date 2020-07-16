package com.sample.tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.sample.constants.Constants;
import com.sample.pages.CalendarPage;




public class CalendarTests 
{
	CalendarPage calculatorobj = new CalendarPage();

    @Test
    public void testCalFun() 
    {    			
    	//CalendarPage calculatorobj = new CalendarPage();
    	Constants ConstObj = new Constants();
    	assertEquals(calculatorobj.validatecalcFunctionality(), ConstObj.EventName); 
    }
    
    @Test
    public void testCalRemainder() 
    {
    	//CalendarPage calculatorobj = new CalendarPage();
    	Constants ConstObj = new Constants();
    	assertEquals(calculatorobj.remainder(), ConstObj.EventRemainder);  
    }
    
    
    @Test
    public void testCountOfEvents() throws InterruptedException 
    {
    	//CalendarPage calculatorobj = new CalendarPage();
    	Constants ConstObj = new Constants();
    	assertEquals(calculatorobj.CountOfEvents(), ConstObj.CountofE); 
    }
}