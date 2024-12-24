package testCases;

import pages.*;

public class PageInitializer {

    public static LoginPage login;
    public static DashboardPage dash;
    public static EmployeeInformationPage emp;
    public static AddEmployeePage addEmployeePage;
    public static PersonalDetailsPage personalDetailsPage;

    public static void initializePageObjects(){
        login = new LoginPage();
        dash = new DashboardPage();
        emp = new EmployeeInformationPage();
        addEmployeePage = new AddEmployeePage();
        personalDetailsPage = new PersonalDetailsPage();
    }


}