package steps;

import com.redsea.base.Base;
import com.redsea.pages.TeamPage;
import com.redsea.pages.VehiclePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TeamSteps extends Base {
    TeamPage teamPage;


    @Given("User go to Team page")
    public void user_go_to_team_page() throws InterruptedException {
        Thread.sleep(3000);
        teamPage = new TeamPage();
        teamPage.gotoTeamPage();
        Thread.sleep(2000);

    }

    @And("click on add new Team")
    public void clickOnAddNewTeam() {
        teamPage.gotoAddIconbutton();
    }

    @When("User type Team new information")
    public void userTypeTeamNewInformation() throws InterruptedException {
        Thread.sleep(4000);
        teamPage.enterTeamName();
        teamPage.enterTeamDescription();
        teamPage.clickOnTeamshift();
        Thread.sleep(2000);
        teamPage.clickOnTeamZoneGroup();
        Thread.sleep(4000);
    }

    @And("click on submit button Team to confirm")
    public void clickOnSubmitButtonTeamToConfirm() throws InterruptedException {
        teamPage.clickOnSubmitButton();
        Thread.sleep(4000);
    }

    @Then("User should navigate to Team dashboard")
    public void userShouldNavigateToTeamDashboard() {
        driver.navigate().refresh();
    }

    @Given("User select Team to update")
    public void userSelectTeamToUpdate() throws InterruptedException {
        Thread.sleep(3000);
        teamPage = new TeamPage();
        teamPage.gotoTeamPage();
        teamPage.clickonsearchbutton();
        teamPage.clickOnEditButton();
    }

    @When("User update Team information")
    public void userUpdateTeamInformation() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(" load Team to update");
        teamPage.enternewupdateforTeam();
    }

    @Then("User click on save Team update button")
    public void userClickOnSaveTeamUpdateButton() throws InterruptedException {
        Thread.sleep(1000);
        teamPage.saveUpdateButton();
    }

    @Given("User select Team to delete")
    public void userSelectTeamToDelete() throws InterruptedException {
        Thread.sleep(3000);
        teamPage = new TeamPage();
        teamPage.gotoTeamPage();
        teamPage.clickonsearchbuttonDelete();
    }

    @When("User click the delete Team button")
    public void userClickTheDeleteTeamButton() throws InterruptedException {
        Thread.sleep(3000);
        teamPage.clickOnDeleteButton();
    }

    @Given("User go to add new Team")
    public void userGoToAddNewTeam() throws InterruptedException {
        Thread.sleep(3000);
        teamPage = new TeamPage();
        teamPage.gotoTeamPage();
        Thread.sleep(3000);
        teamPage.gotoAddIconbutton();

    }

    @When("User click directly on submit Team button")
    public void userClickDirectlyOnSubmitTeamButton() throws InterruptedException {
        teamPage.clickOnSubmitButton();
        Thread.sleep(2000);
    }

    @Then("Error messages should be displayed Team")
    public void errorMessagesShouldBeDisplayedTeam() {
        String TeamNameError = teamPage.getTeamNameErrorMessage();
        Assert.assertEquals((TeamNameError), "Team name is required");

        String predefinedShiftError = teamPage.getpredefinedShiftErrorMessage();
        Assert.assertEquals((predefinedShiftError), "Shift is required");

        String zoneGroupError = teamPage.getzoneGroupErrorMessage();
        Assert.assertEquals((zoneGroupError), "Zone Group is required");

        String zoneError = teamPage.getzoneErrorMessage();
        Assert.assertEquals((zoneError), "Zone is requred");
    }

    @And("User quit the add page Team")
    public void userQuitTheAddPageTeam() throws InterruptedException {
        teamPage.cancelButton();
        Thread.sleep(3000);
    }
}
