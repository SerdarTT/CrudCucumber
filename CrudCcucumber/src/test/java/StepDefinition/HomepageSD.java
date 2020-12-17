package StepDefinition;

import Pages.Homepage;
import Pages.WelcomePage;
import Utils.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomepageSD {
    Homepage hpage = new Homepage();
    WelcomePage wpage = new WelcomePage();
    @When("^I click to signIn button$")
    public void clickToSignIn(){
        Helper.pause(2);
        hpage.clickOnHomeSignIn();
    }

    @When("^I enter (.+) in email$")
    public void enterEmail(String email){
        Helper.pause(2);
        hpage.enterUserName(email);
    }
    @When("^I enter (.+) in passowrd$")
    public void enterPassword(String pwd){
        Helper.pause(2);
        hpage.enterUserPass(pwd);
    }
    @When("^I click on Sign in button$")
    public void clickSignInButton(){
        Helper.pause(2);
        hpage.clickToSign();
    }
    @Then("^I verify I am on Homepage$")
    public void isHomePageDisplayed(){
        Helper.pause(3);
        Assert.assertTrue(wpage.isFeedDisplayed(), "Edit is not displayed after signedIn");
    }
    @Then("^I verify I get error message$")
    public void isSignInErrorDisplayed(){
        Assert.assertTrue(hpage.isSignInErrorDisplayed(), "Sign in error is not Displayed");
    }

}
