package tests;

import org.junit.Test;

// написать логин на кнопку вумен и вытягивать цвета и
public class FiltersTest extends SampleTest {
    @Test
    public  void filtersTest() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.fillEmailAddress("automationstep@gmail.com");
        user.mainPage.fillPasswordAddress("123456");
        user.mainPage.clickOnSubmitLoginButton();
        user.mainPage.clickOnWomenTab();
        user.mainPage.checkOrangeColorsOnItems();


    }


}
