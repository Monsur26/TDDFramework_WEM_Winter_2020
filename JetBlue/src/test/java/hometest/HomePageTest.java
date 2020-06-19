package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends WebAPI {

    static HomePage homePage;

    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test //Nadim test 1
    public void jetBlueFromAfrica() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.jetblue.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.jbFrom();
        sleepFor(1);
        homePage.JbFromBrowseByRegion();
        sleepFor(1);
        homePage.setJBFromAfrica();
    }

    @Test //Nadim test 2
    public void jetBlueFromAsia() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.jetblue.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.jbFrom();
        sleepFor(1);
        homePage.JbFromBrowseByRegion();
        sleepFor(1);
        homePage.setJBFromAsia();
    }

    @Test //Nadim test 3
    public void jetBlueFromCA() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.jetblue.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.jbFrom();
        sleepFor(1);
        homePage.JbFromBrowseByRegion();
        sleepFor(1);
        homePage.setJBFromCA();
    }

    @Test //Nadim test 4
    public void jetBlueFromEurope() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.jetblue.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.jbFrom();
        sleepFor(1);
        homePage.JbFromBrowseByRegion();
        sleepFor(1);
        homePage.setJBFromEurope();
    }

    @Test //Nadim test 5
    public void jetBlueFromArab() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.jetblue.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.jbFrom();
        sleepFor(1);
        homePage.JbFromBrowseByRegion();
        sleepFor(1);
        homePage.setJBFromArab();
    }

    @Test //Nadim test 6
    public void jetBlueFromSA() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.jetblue.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.jbFrom();
        sleepFor(1);
        homePage.JbFromBrowseByRegion();
        sleepFor(1);
        homePage.setJBFromSA();
    }

    @Test //Nadim test 7
    public void jetBlueFromNA() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.jetblue.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.jbFrom();
        sleepFor(1);
        homePage.JbFromBrowseByRegion();
        sleepFor(1);
        homePage.setJBFromAfrica();
        sleepFor(1);
        homePage.setJBFromNA();
    }

    @Test //Nadim test 8
    public void jetBlueFromNABuffalo() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.jetblue.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.jbFrom();
        sleepFor(1);
        homePage.JbFromBrowseByRegion();
        sleepFor(1);
        homePage.setJBFromNABuffaloNY();
    }

    @Test //Nadim test 9
    public void jetBlueFromNADetroit() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.jetblue.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.jbFrom();
        sleepFor(1);
        homePage.JbFromBrowseByRegion();
        sleepFor(1);
        homePage.setJBFromNADetroitMI();
    }

    @Test //Nadim test 10
    public void jetBlueTimeTableDropDown() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.jetblue.com");
        driver.manage().window().maximize();
        sleepFor(2);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,2500)", "");
        sleepFor(1);
        homePage.setJbTimeTablesComplete();
        sleepFor(2);
//        Select dropdown = new Select(driver.findElement(By.cssSelector("#ddlFromStations")));
//        dropdown.selectByValue("BUR-STA");
        driver.findElement(By.xpath("//select[@id='ddlFromStations']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Bridgetown, BGI (BGI)')]")).click();

    }

    @Test //Nadim test 11
    public void jetBlueDropDownTableSucksSoUsingAnotherSite() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "http://automationpractice.com/index.php?id_category=5&controller=category");
        driver.manage().window().maximize();
        sleepFor(2);
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
        dropdown.selectByValue("name:asc");
//        driver.findElement(By.xpath("//select[@id='ddlFromStations']")).click();
//        driver.findElement(By.xpath("//option[contains(text(),'Bridgetown, BGI (BGI)')]")).click();

    }

}
