package androidsamsungs9.test;

import androidsamsungs9.tdbankpages.HomePage;
import com.pnt.mobileaoutomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Regression extends TestBase {
    @Test
    public void validateUserCanClickOnAccountsButton() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        homePage.clickOnAccountsButton();
    }

    @Test
    public void validateUserBeingAbleToClickBetweenButtonsFromHeader() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);

        homePage.clickOnAccountsButton();

        homePage.clickOnDepositButton();
    }
}
