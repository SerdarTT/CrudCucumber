package StepDefinition;

import Pages.Update;
import Utils.Helper;
import cucumber.api.java.en.When;

public class UpdateSD {

    Update upage = new Update();
    @When("^I clean title box$")
    public void cleanTitleBox(){
        Helper.pause(2);
        upage.cleanTitleBox();
    }

    @When("^I enter (.+) in new Title box$")
    public void enterNewTitle(String newTitle){
        Helper.pause(2);
        upage.enterNewTitle(newTitle);
    }
    @When("^I clean article box$")
    public void cleanArticle(){
        Helper.pause(2);
        upage.cleanArticle();
    }
    @When("^I clean tag box$")
    public void cleanTag(){
        upage.cleanTagsBox();
    }


}
