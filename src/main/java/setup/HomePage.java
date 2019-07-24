package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"header-widget\"]/div/div/div/div[1]/a/img")
    WebElement CostcoLogo;
    @FindBy(id="search-dropdown-select")
    WebElement allcategSelect;
    @FindBy(id="warehouse-locations-dropdown")
    WebElement warehouse;
    @FindBy(xpath = "//*[@id=\"locator_search_filters\"]/div[1]/div[2]/label")
    WebElement checkbox;






    public void setCostcoLogo(){
        if(CostcoLogo.isDisplayed())
            Assert.assertTrue(true);

    }
    public void selectGrocery(){
        Select select = new Select(allcategSelect);
        select.selectByVisibleText("Grocery");
        sleepfor(5);
    }
    public void checkBoxGaz(){
        Actions actions = new Actions(driver);
        actions.moveToElement(warehouse).build().perform();
        sleepfor(5);
        checkbox.click();
    }
}
