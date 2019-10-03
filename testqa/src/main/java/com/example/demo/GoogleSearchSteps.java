package com.example.demo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//Error con librerias de TestRunner Cucumber y entorno. Clase no utilizada.

public class GoogleSearchSteps {
	
	

    public GoogleSearchSteps() {
        
    }

    @Given("^I’m on the homepage$")
    public void aUserOnHomePage() {
       
    }

    @When("^I type 'The name of the wind' into the search field$")
    public void aUserTypeOnHomePe() {
        
    }
    
    @And("^I click the Google Search button $") 
    public void clickOnSearchButton() {
        
    }
    
    @Then("^I go to the search results page$")  
      public void searchResult() {
        
    }
    
    @And("^the first result is 'The Name of the Wind - Patrick Rothfuss'$") 
    public void firstResult() {
        
    }
    
    @When("^I click on the first result link$")   
   public void clickOnFirstResult() {
        
    }
    @Then("^I go to the “Patrick Rothfuss - The Books” page$") 
    public void goPage() {
        System.out.println("Prueba a ver si entra");
    }
    
   

}
