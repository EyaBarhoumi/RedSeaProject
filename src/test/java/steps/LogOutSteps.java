package steps;

import com.redsea.base.Base;
import com.redsea.pages.LogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutSteps extends Base {

    LogoutPage logoutPage = new LogoutPage();

    @Given("User should be  logged in")
    public void user_should_be_logged_in() {

    }

    @When("User  logout")
    public void user_logout() {
        logoutPage.performLogout();
    }

    @Then("User should be logged out")
    public void user_should_be_logged_out() {
        System.out.println("user logged out");
    }
}
