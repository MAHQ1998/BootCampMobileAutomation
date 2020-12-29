package androidsamsungs9.tdbankpages;

import com.pnt.mobileaoutomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Go Back']")
    private WebElement backBtn;
    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountBtn;

    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    private WebElement clickOnUsername;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement clickOnPassword;

    @FindBy(xpath = "//android.widget.Button[@text='Log in']")
    private WebElement clickLogIn;


    public void clickOnBackButton() {
        backBtn.click();
        ExtentTestManager.log("Back button pressed");

    }


}
