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
    private final By addToCartBackpack;
    private final By addToCartBikeLight;
    private final By addToCartTShirt;
    private final By addToCartFleeceJacket;
    private final By addToCartLabsOnesie;
    private final By addToCartTShirtRed;

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
        addToCartBackpack = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
        addToCartBikeLight = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
        addToCartTShirt = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
        addToCartFleeceJacket = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
        addToCartLabsOnesie = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
        addToCartTShirtRed = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
    }

    public void addProducttoCart(String product){
        switch (product){
            case "Sauce Labs Backpack":
                driver.findElement(addToCartBackpack).click();
                break;
            case "Sauce Labs Bike Light":
                driver.findElement(addToCartBikeLight).click();
                break;
            case "Sauce Labs Bolt T-Shirt":
                driver.findElement(addToCartTShirt).click();
                break;
            case "Sauce Labs Fleece Jacket":
                driver.findElement(addToCartFleeceJacket).click();
                break;
            case "Sauce Labs Onesie":
                driver.findElement(addToCartLabsOnesie).click();
                break;
            case "Test.allTheThings() T-Shirt (Red)":
                driver.findElement(addToCartTShirtRed).click();
                break;
            default:
                driver.findElement(addToCartBackpack).click();
                System.out.println("Productos no existe.");
        }
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
