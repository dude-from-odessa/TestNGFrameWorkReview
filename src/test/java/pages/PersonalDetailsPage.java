package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class PersonalDetailsPage extends CommonMethods {

    @FindBy(id = "personal_txtEmployeeId")
    public WebElement employeeID;

    @FindBy(linkText = "Personal Details")
    public WebElement personalDetailsLink;

    @FindBy(id = "btnSave")
    public WebElement editButton;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(id = "personal_txtEmpFirstName")
    public WebElement firstName;

    @FindBy(id = "personal_txtEmpMiddleName")
    public WebElement middleName;

    @FindBy(id = "personal_txtEmpLastName")
    public WebElement lastName;

    @FindBy(id = "personal_txtOtherID")
    public WebElement otherID;

    @FindBy(id = "personal_txtLicenNo")
    public WebElement driverLicense;

    @FindBy(id = "personal_txtNICNo")
    public WebElement ssnNumber;

    @FindBy(id = "personal_txtSINNo")
    public WebElement sinNumber;

    @FindBy(id = "personal_txtEmpNickName")
    public WebElement nickName;

    @FindBy(id = "personal_txtMilitarySer")
    public WebElement militaryService;

    @FindBy(id = "txtAttDesc")
    public WebElement comment;

    @FindBy(xpath = "//input[@id='personal_txtLicExpDate']/following-sibling::img")
    public WebElement licenseExpiryDateCalendar;

    @FindBy(className = "ui-datepicker-month")
    public WebElement expiryMonthSelect;

    @FindBy(className = "ui-datepicker-year")
    public WebElement expiryYearSelect;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")
    public List<WebElement> datesList;

    @FindBy(id="personal_optGender_1")
    public WebElement maleRadioButton;

    @FindBy(id="personal_optGender_2")
    public WebElement femaleRadioButton;

    @FindBy(id="personal_cmbMarital")
    public WebElement maritalSelect;

    @FindBy(id="personal_cmbNation")
    public WebElement nationalitySelect;

    @FindBy(xpath = "//input[@id='personal_DOB']/following-sibling::img")
    public WebElement dateOfBirthCalendar;

    @FindBy(className = "ui-datepicker-month")
    public WebElement monthOfBirthSelect;

    @FindBy(className = "ui-datepicker-year")
    public WebElement yearOfBirthSelect;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")
    public List<WebElement> datesOfBirthList;

    @FindBy(id="personal_chkSmokeFlag")
    public WebElement smokerFlag;

    @FindBy(id="btnAddAttachment")
    public WebElement addAttachmentButton;

    @FindBy(id="ufile")
    public WebElement chooseFile;

    @FindBy(id="btnSaveAttachment")
    public WebElement uploadButton;

    @FindBy(xpath = "//table[@id='tblAttachments']/tbody/tr/td/a")
    public List<WebElement> uploadedFiles;

    @FindBy(xpath = "//table[@id='tblAttachments']/tbody/tr/td")
    public List<WebElement> uploadedTable;

    public PersonalDetailsPage() {
        PageFactory.initElements(driver, this);
    }
}
