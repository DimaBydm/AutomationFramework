package tests;

import org.junit.Test;

// Описываем тест, который будем выполнять:
public class LoginTest extends SampleTest {

    // Аннотация:
    // для выполнения теста:
    @Test
    public void loginTest() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
    }
}
