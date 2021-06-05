package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 extends BasePage {

    public Page1() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='txt_val_1']")
    static WebElement txt_val_1;
    @FindBy(xpath = "//*[@id='txt_val_2']")
    static WebElement txt_val_2;
    @FindBy(xpath = "//*[@id='txt_val_4']")
    static WebElement txt_val_3;
    @FindBy(xpath = "//*[@id='txt_val_5']")
    static WebElement txt_val_4;
    @FindBy(xpath = "//*[@id='txt_val_6']")
    static WebElement txt_val_5;
    @FindBy(xpath = "//*[@id='txt_ttl_val']")
    static WebElement txt_totalBalance;

    public String getValue1() {
        return txt_val_1.getText();
    }

    public String getValue2() {
        return txt_val_2.getText();
    }

    public String getValue3() {
        return txt_val_3.getText();
    }

    public String getValue4() {
        return txt_val_4.getText();
    }

    public String getValue5() {
        return txt_val_5.getText();
    }

    public String getTotalBalance() {
        return txt_totalBalance.getText();
    }
}
