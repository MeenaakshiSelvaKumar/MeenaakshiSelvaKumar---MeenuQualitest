package com.Test.Meenaakshi.StepDefinition;

import com.Test.Meenaakshi.OrderTshirt;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

public class Steps {

	@Given("^Open the Chrome and launch the application$")				
    public void signandordertshirt() throws Throwable							
    {	
		new OrderTshirt();
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @Then("Order Tshirt")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("Orders Tshirt and confirms the payment");					
    }	
	
}
