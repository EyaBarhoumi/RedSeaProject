package steps;

import com.redsea.base.Base;
import com.redsea.pages.VehiclePage;
import com.redsea.pages.WorkforcePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehicleSteps extends Base {
    VehiclePage vehiclePage;

    @Given("User go to vehicle page")
    public void user_go_to_vehicle_page() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
        Thread.sleep(2000);
    }


    @And("click on add new vehicle")
    public void clickOnAddNewVehicle() {
        vehiclePage.gotoAddIconbutton();
        vehiclePage.gotoAddvehicle();
    }

    @When("User type vehicle new information")
    public void userTypeVehicleNewInformation() throws InterruptedException {
        Thread.sleep(4000);
        vehiclePage.enterVehicleId();
        vehiclePage.clickonBrand();
        vehiclePage.clickonVehicleProfile();
        vehiclePage.enterPlateNumber();
        vehiclePage.clickonColor();
        vehiclePage.clickonDriveName();
        vehiclePage.clickonShift();
        Thread.sleep(4000);
    }

    @And("click on submit button vehicle to confirm")
    public void clickOnSubmitButtonVehicleToConfirm() throws InterruptedException {
        vehiclePage.submitNewVehicle();
        Thread.sleep(4000);
    }

    @Then("User should navigate to vehicle dashboard")
    public void userShouldNavigateToVehicleDashboard() {
        driver.navigate().refresh();
    }

    @Given("User select vehicle to update")
    public void userSelectVehicleToUpdate() throws InterruptedException {
        Thread.sleep(1000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
        Thread.sleep(1000);
        vehiclePage.clickonsearchbutton();
        vehiclePage.clickOnEditButton();
    }

    @When("User update vehicle information")
    public void userUpdateVehicleInformation() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(" load vehicle to update");
        vehiclePage.enternewupdateforvehicle();
    }

    @Then("User click on save vehicle update button")
    public void userClickOnSaveVehicleUpdateButton() throws InterruptedException {
        Thread.sleep(1000);
        vehiclePage.saveUpdateButton();
    }

    @Given("User select vehicle to delete")
    public void userSelectVehicleToDelete() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
        vehiclePage.clickonsearchbuttonDelete();
    }

    @When("User click the delete vehicle button")
    public void userClickTheDeleteVehicleButton() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage.clickOnDeleteButton();
    }

    @Given("User go to vehicle menu")
    public void userGoToVehicleMenu() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
    }

    @When("User click on import vehicle list")
    public void userClickOnImportVehicleList() throws InterruptedException {
        System.out.println(" load Vehicle to import");
        Thread.sleep(1000);
        vehiclePage.importnewVehicle();
    }

    @Then("User add the vehicle list")
    public void userAddTheVehicleList() {
        vehiclePage.clickondragbutton();
        vehiclePage.SaveImport();
    }

    @When("User click on export vehicle button")
    public void userClickOnExportVehicleButton() throws InterruptedException {
        Thread.sleep(1000);
        vehiclePage.clickonexportbutton();
        Thread.sleep(4000);
    }

    @Given("User go to add new vehicle")
    public void userGoToAddNewVehicle() throws InterruptedException {
        Thread.sleep(3000);
        vehiclePage = new VehiclePage();
        vehiclePage.gotovehiclePage();
        Thread.sleep(2000);
        vehiclePage.gotoAddIconbutton();
        vehiclePage.gotoAddvehicle();

    }

    @When("User click directly on submit vehicle button")
    public void userClickDirectlyOnSubmitVehicleButton() throws InterruptedException {
        vehiclePage.submitNewVehicle();
        Thread.sleep(2000);
    }

    @Then("Error messages should be displayed vehicle")
    public void errorMessagesShouldBeDisplayedVehicle() {
        String VehicleIdError = vehiclePage.getVehicleIdErrorMessage();
        Assert.assertEquals((VehicleIdError), "Vehicle Id is required");

        String brandError = vehiclePage.getbrandErrorMessage();
        Assert.assertEquals((brandError), "brand is required");

        String ProfileError = vehiclePage.getProfileErrorMessage();
        Assert.assertEquals((ProfileError), "Profile is required");

        String PlateError = vehiclePage.getPlateErrorMessage();
        Assert.assertEquals((PlateError), "Plate Number is required");

        String ColorError = vehiclePage.getColorErrorMessage();
        Assert.assertEquals((ColorError), "Color is required");

        String ShiftError = vehiclePage.getShiftErrorMessage();
        Assert.assertEquals((ShiftError), "Shift is required");
    }

    @And("User quit the add page vehicle")
    public void userQuitTheAddPageVehicle() throws InterruptedException {
        vehiclePage.cancelButton();
        Thread.sleep(2000);
    }
}
