package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


public class InventaryPage {

    private WebDriver driver;

    private final By headerInventaryPage;
    private final By sortProducts;
    private final By itemProduct;
    private final By sortDropDownAzOption;
    private final By sortDropDownZaOption;
    private final By sortDropDownLhOption;
    private final By sortDropDownHlOption;
    private final By priceProducts;
    private final By nameProducts;

    String orderProductsLowHigh = "[$7.99, $9.99, $15.99, $15.99, $29.99, $49.99]";
    String orderProductsHighLow = "[$49.99, $29.99, $15.99, $15.99, $9.99, $7.99]";
    String orderProductsZa = "[Test.allTheThings() T-Shirt (Red), Sauce Labs Onesie, Sauce Labs Fleece Jacket, Sauce Labs Bolt T-Shirt, Sauce Labs Bike Light, Sauce Labs Backpack]";
    String orderProductsAz = "[Sauce Labs Backpack, Sauce Labs Bike Light, Sauce Labs Bolt T-Shirt, Sauce Labs Fleece Jacket, Sauce Labs Onesie, Test.allTheThings() T-Shirt (Red)]";

    public InventaryPage(WebDriver driver){
        this.driver = driver;
        headerInventaryPage = By.xpath("//div[@class='app_logo']");
        sortProducts = By.xpath("//select[@class='product_sort_container']");
        itemProduct = By.xpath("//*[@id='item_0_title_link']/div");
        sortDropDownAzOption = By.cssSelector("option[value='az']");
        sortDropDownZaOption = By.cssSelector("option[value='za']");
        sortDropDownLhOption = By.cssSelector("option[value='lohi']");
        sortDropDownHlOption = By.cssSelector("option[value='hilo']");
        priceProducts = By.xpath("//div[@class='inventory_item_price']");
        nameProducts = By.xpath("//div[@class='inventory_item_name']");
    }

    public void sortProductsNameAz(){

        driver.findElement(sortProducts).click();
        driver.findElement(sortDropDownAzOption).click();

    }

    public void sortProductsNameZa() {

        driver.findElement(sortProducts).click();
        driver.findElement(sortDropDownZaOption).click();
    }

    public void sortProductsPriceLh() {

        driver.findElement(sortProducts).click();
    }

    public void sortProductsPriceHl(){

        driver.findElement(sortDropDownHlOption).click();
    }

    public void orderPriceLowHigh(){

        driver.findElement(sortDropDownLhOption).click();
        List<WebElement> price = driver.findElements(priceProducts);
        ArrayList<String> priceList = new ArrayList<>();
        for (WebElement webElement : price) {
            priceList.add(webElement.getText());
        }
        Assert.assertEquals(orderProductsLowHigh, priceList.toString());
    }

    public void orderPriceHighLow(){

        driver.findElement(sortDropDownHlOption).click();
        List<WebElement> price = driver.findElements(priceProducts);
        ArrayList<String> priceList = new ArrayList<>();
        for (WebElement webElement : price) {
            priceList.add(webElement.getText());
        }
        Assert.assertEquals(orderProductsHighLow, priceList.toString());
    }

    public void orderNameZa(){

        driver.findElement(sortDropDownZaOption).click();
        List<WebElement> name = driver.findElements(nameProducts);
        ArrayList<String> nameList = new ArrayList<>();
        for (WebElement webElement : name) {
            nameList.add(webElement.getText());
        }
        Assert.assertEquals(orderProductsZa, nameList.toString());
    }
        public void orderNameAz(){

        driver.findElement(sortDropDownAzOption).click();
        List<WebElement> name = driver.findElements(nameProducts);
        ArrayList<String> nameList = new ArrayList<>();
        for (WebElement webElement : name) {
            nameList.add(webElement.getText());
        }
        Assert.assertEquals(orderProductsAz, nameList.toString());
    }
}
