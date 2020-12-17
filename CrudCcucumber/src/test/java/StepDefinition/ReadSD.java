package StepDefinition;

import Pages.Homepage;
import Pages.Read;
import Pages.WelcomePage;
import cucumber.api.java.en.When;

public class ReadSD {

    Read rpage = new Read();

    @When("^I click on profile$")
    public void clickOnProfile(){
        rpage.clickProfile();
    }
    @When("^I click on title$")
    public void clickOnTitle(){
        rpage.clickTitle();
    }
    @When("^I click on edit button$")
    public void clickOnEdit(){
        rpage.clickToEdit();
    }
    @When("^I clean about box$")
    public void clean(){
        rpage.cleanAbout();
    }
}
