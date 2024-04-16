package com.stepdefinition;

import org.testng.asserts.SoftAssert;

import com.baseclass.BaseClassHealth;
import com.pojohealth.PojoMenu;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepMenuFunctionality extends BaseClassHealth {
	PojoMenu pm;

	@When("User looks at the menu bar")
	public void user_looks_at_the_menu_bar() {
		   
	    
	}

	@When("User navigate the menus")
	public void user_navigate_the_menus() {
		pm=new PojoMenu();
		click(pm.getAbout());
		click(pm.getWhat());
		click(pm.getTreatments());
		click(pm.getFindDoctor());
		click(pm.getFindLocation());
		click(pm.getPatient());
		click(pm.getSpineLogo());
		
	
	}
	@Then("User should see click all menus")
	public void user_should_see_click_all_menus() {
		String actualTitle=driver.getCurrentUrl();
		String expectedTitle="https://www.treatingpain.com/";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle, "Same or not");
		
		s.assertAll();
		close();
	    
	}

	
}
