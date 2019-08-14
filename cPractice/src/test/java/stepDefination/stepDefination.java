package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

    
	@Given("^user is on lading page$")
    public void user_is_on_lading_page() throws Throwable {
		System.out.println("landing page");
    }

    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String s,String s1) throws Throwable {
    	System.out.println("enter login");
    }

    @Then("^homepage will be displayed$")
    public void homepage_will_be_displayed() throws Throwable {
        System.out.println("home page");
    }

    @And("^all the details are displayed$")
    public void all_the_details_are_displayed() throws Throwable {
    	System.out.println("all details are displayed");
    }

}