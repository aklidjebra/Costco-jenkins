package regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import setup.CommonAPI;
import setup.HomePage;

public class TestHomePage extends CommonAPI {

    HomePage homeObje;

    @BeforeMethod
     public void init(){
        homeObje= PageFactory.initElements(driver,HomePage.class);

    }
    @Test
    public void setCostcoLogoTest(){
        homeObje.setCostcoLogo();
    }
    @Test
    public void selectgroceryTest(){
        homeObje.selectGrocery();
    }
    @Test
    public void ActionsTest(){
        homeObje.checkBoxGaz();

    }



}
