package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage;
    public static void getInitElements() {homePage= PageFactory.initElements(driver,HomePage.class);
    }
   /* @Test
    public void testTopMenu() throws InterruptedException {
        getInitElements();
        homePage.menuTop();}
    @Test
    public void testNavigation() throws InterruptedException {
        getInitElements();
        homePage.menuNavigation();}
*/    @Test
    public void testLogInMenu() throws InterruptedException {
        getInitElements();
        homePage.menuLogIn();}
  /*  @Test
    public void testButtonSearch() throws InterruptedException {
        getInitElements();
        homePage.buttonSearch();}
    @Test
    public void testAccessUser() throws InterruptedException {
        getInitElements();
        homePage.accessUser();}
    @Test
    public void testServiceQuick() throws InterruptedException {
        getInitElements();
        homePage.serviceQuick();}
    @Test
    public void testMenuService() throws InterruptedException {
        getInitElements();
        homePage.serviceQuick();}
*/
  @Test
    public void testWindowSwitching(){
      getInitElements();
      homePage.switchingToNewWindowLogin();

  }
}
