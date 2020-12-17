package Pages;

import Utils.Helper;
import org.openqa.selenium.By;

public class WelcomePage extends Basepage{
    By pageObjectDisplayed = By.xpath("//a[contains(text(),'Your Feed')]");
    By editArticle = By.xpath("//a[@class='btn btn-sm btn-outline-secondary']//following::i[@class='ion-edit']");

    public boolean isFeedDisplayed(){
        Helper.pause(2);
        return isElementDisplayed(pageObjectDisplayed);
    }

    //Display for CRUD-Create
    public boolean isEditButtonDisplayed(){
        Helper.pause(2);
        return isElementDisplayed(editArticle);}







}
