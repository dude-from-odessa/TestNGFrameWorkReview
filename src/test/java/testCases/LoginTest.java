package testCases;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class LoginTest extends CommonMethods {

    // verify that Login Panel text is 'login panel'

    @Test
    public void VerifyLoginPanel(){
        String loginPanelText = login.loginPanel.getText();
        Assert.assertEquals(loginPanelText,"LOGIN Panel");
    }

    // verify login with multiple credentials
    @DataProvider(name="Credentials")
    public Object [][] data(){

        Object[][] loginData={
                {"Admin","abc","Invalid credentials"},
                {"Admin","xyz","Invalid credentials"},
                {"Admin","","Password cannot be empty"},
                {"","hum","Username cannot be empty"}
        };
        return  loginData;
    }

    @Test(dataProvider = "Credentials")
    public void invalidCredentials(String userName , String password , String errorMsg){

        login.usernameTextField.sendKeys(userName);
        login.passwordTextField.sendKeys(password);
        click(login.loginButton);
        String Msg=login.errorMessage.getText();

        Assert.assertEquals(Msg,errorMsg);

    }
}
