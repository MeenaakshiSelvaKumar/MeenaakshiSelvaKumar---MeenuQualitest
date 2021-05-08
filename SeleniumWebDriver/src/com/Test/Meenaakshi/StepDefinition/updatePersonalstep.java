package com.Test.Meenaakshi.StepDefinition;

import com.Test.Meenaakshi.UpdatePersonalDetails;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class updatePersonalstep {

	@Given("^Open the Chrome and launch the application$")				
    public void signandordertshirt() throws Throwable							
    {	
		new UpdatePersonalDetails();
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @Then("^Update the First Name")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("This step update First Name and Click on save button");					
    }	
}
