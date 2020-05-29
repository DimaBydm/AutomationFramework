package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

// Стандартный адрес:
@DefaultUrl("http://automationpractice.com/index.php")

// Наследуем бейз пейдж:
public class MainPage extends BasePage{

    //// Локаторы:

    // Аннтоация:
    // указываем локатор
    // в данном случае сss
    @FindBy(css = "a.login")
    // Указываем веб элемент и его название:
    private WebElement signInButton;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy (id = "passwd")
    private WebElement passwordField;

    @FindBy (css = "a[title= 'Women']")
    private WebElement womenTab;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButtonOnLoginPage;

    @FindBy(css = "a[style ='background:#F39C11;']")
    private WebElement orangeBox;

    @FindBy (css = "ul[class='color_to_pick_list clearfix']")
    private List<WebElement> colorBoxes;
    ////

    // Создается автоматом после наследования бейз пейджа:
    public MainPage(WebDriver driver) {
        super(driver);
    }

    //// Методы:

    //Открытия страницы:
    public void openMainPage() {
        open();
    }

    // Нажатия кнопки указанного элемента:
    public void clickOnSignInButton() {
        element(signInButton).click();
    }

    // Записи в поле емеила почты нашего аккаунта:
    public void fillEmailAddress(String email){
        element(emailField).sendKeys(email);
    }

    public void fillPasswordAddress(String password) {
        element(passwordField).sendKeys(password);
    }

    public void clickOnSubmitLoginButton(){
        element(signInButtonOnLoginPage).click();
    }
    public void clickOnWomenTab () {
        element(womenTab).click();
    }
   private List<WebElement> getColorBoxes () {
       return colorBoxes;
   }
   public void checkOrangeColorsOnItems (){
        int counter = 0;
      for (int i = 0; i < getColorBoxes().size();i++){
          if(getColorBoxes().get(i).findElements(By.cssSelector("a[style='background:#F39C11;']")).size() == 1){
              counter++;
      }
      }
       Assert.assertEquals(3, counter);
   }


    ////

}
