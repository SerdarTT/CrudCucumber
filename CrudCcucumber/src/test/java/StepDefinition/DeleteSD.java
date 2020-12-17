package StepDefinition;

import Pages.Delete;
import cucumber.api.java.en.When;

public class DeleteSD {

    Delete dpage = new Delete();
    @When("^I click to delete article$")
    public void deleteArticle(){
        dpage.delete();

    }
}
