package StepDefinition;

import Pages.Create;
import Pages.Homepage;
import Pages.WelcomePage;
import Utils.Helper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.He;
import org.testng.Assert;

public class CreateSD {

    Homepage hpage = new Homepage();
    WelcomePage wpage = new WelcomePage();
    Create cpage = new Create();
    @When("^I click on new post$")
    public void clickOnNew(){
        Helper.pause(2);
        cpage.newPost();
    }
    @When("^I enter (.+) in title box$")
    public void enterArtcle(String articleTitle){
        cpage.enterArticleTitle(articleTitle);
    }
    @When("^I enter (.+) in about article$")
    public void aboutArticle(String about){
        cpage.enterAboutArticle(about);
    }
    @When("^I enter (.+) in article box$")
    public void article(String articleT){
        Helper.pause(2);
        cpage.enterArticle(articleT);
    }
    @When("^I enter (.+) in tag box$")
    public void tags(String tag){
        cpage.enterTags(tag);
    }
    @Then("^I click to publish article$")
    public void clickPublish(){
        cpage.clickToPublish();
    }

}
