package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.Page1;

import java.util.concurrent.TimeUnit;

public class Page1_Steps extends BasePage {

    Page1 page1 = new Page1();

    public Page1_Steps() {
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get(prop.getProperty("URL").toString());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void verifyTotalBalanceMatchesSumOfValues() {
        Assert.assertTrue("Total Balance is not equal to Sum of Values", calculateSumOfValues() == convertTotalBalanceToFloat());
    }

    public Float convertTotalBalanceToFloat() {
        return Float.parseFloat(removeSpecialSymbols(page1.getTotalBalance()));
    }

    public Float calculateSumOfValues() {
        float val1 = Float.parseFloat(removeSpecialSymbols(page1.getValue1()));
        float val2 = Float.parseFloat(removeSpecialSymbols(page1.getValue2()));
        float val3 = Float.parseFloat(removeSpecialSymbols(page1.getValue3()));
        float val4 = Float.parseFloat(removeSpecialSymbols(page1.getValue4()));
        float val5 = Float.parseFloat(removeSpecialSymbols(page1.getValue5()));
        return val1 + val2 + val3 + val4 + val5;
    }

    public String removeSpecialSymbols(String value) {
        return value.replace("$", "").replace(",", "");
    }

    public void verifyCurrencyForAllValues(String currencySymbol) {
        Assert.assertTrue("Value 1 is not formatted with given currency", page1.getValue1().contains(currencySymbol));
        Assert.assertTrue("Value 2 is not formatted with given currency", page1.getValue2().contains(currencySymbol));
        Assert.assertTrue("Value 3 is not formatted with given currency", page1.getValue3().contains(currencySymbol));
        Assert.assertTrue("Value 4 is not formatted with given currency", page1.getValue4().contains(currencySymbol));
        Assert.assertTrue("Value 5 is not formatted with given currency", page1.getValue5().contains(currencySymbol));
        Assert.assertTrue("Total Balance is not formatted with given currency", page1.getTotalBalance().contains(currencySymbol));
    }

    public void verifyValuesGreaterThanGivenValue(int value) {
        Assert.assertTrue("Value 1 is less than given value", Float.parseFloat(removeSpecialSymbols(page1.getValue1())) > value);
        Assert.assertTrue("Value 2 is less than given value", Float.parseFloat(removeSpecialSymbols(page1.getValue2())) > value);
        Assert.assertTrue("Value 3 is less than given value", Float.parseFloat(removeSpecialSymbols(page1.getValue3())) > value);
        Assert.assertTrue("Value 4 is less than given value", Float.parseFloat(removeSpecialSymbols(page1.getValue4())) > value);
        Assert.assertTrue("Value 5 is less than given value", Float.parseFloat(removeSpecialSymbols(page1.getValue5())) > value);
    }
}
