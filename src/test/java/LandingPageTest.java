import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Project Name    : first_appium_test
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 6/28/2020
 * Time            : 11:55 AM
 * Description     :
 **/


public class LandingPageTest {

    private final String menuItemNamePlaceholder = "#menuItemName";
    private final String menuItemXpath = "//android.widget.TextView[@content-desc=\"" + menuItemNamePlaceholder + "\"]";

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException {
        String PROJECT_ROOT = System.getProperty("user.dir");
        String ANDROID_APK_PATH = "/src/test/resources/ApiDemos.apk";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy Nexus API 24");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0.0");
        caps.setCapability("app", new File(PROJECT_ROOT + ANDROID_APK_PATH).getAbsolutePath());
        caps.setCapability("appPackage", "io.appium.android.apis");
        caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
        caps.setCapability("noReset", true);
        caps.setCapability("fullReset", false);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void toolBarTest() {
        By toolBarTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");

        // Wait until application tool bar is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (toolBarTitle));

        // Verify that the tool bar title is API Demos
        Assert.assertEquals(driver.findElement(toolBarTitle).getText(), "API Demos");
    }

    @Test
    public void accessibilityMenuTest() {
        // Verify Accessibility menu item is visible
        MobileElement accessibilityMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Accessibility")));

        Assert.assertTrue(accessibilityMenuItem.isDisplayed());
    }

    @Test
    public void animationMenuTest() {
        // Verify Animation menu item is visible
        MobileElement animationMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Animation")));

        Assert.assertTrue(animationMenuItem.isDisplayed());
    }

    @Test
    public void appMenuTest() {
        // Verify App menu item is visible
        MobileElement appMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "App")));

        Assert.assertTrue(appMenuItem.isDisplayed());
    }

    @Test
    public void contentMenuTest() {
        // Verify Content menu item is visible
        MobileElement contentMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Content")));

        Assert.assertTrue(contentMenuItem.isDisplayed());
    }

    @Test
    public void graphicsMenuTest() {
        // Verify Graphics menu item is visible
        MobileElement graphicsMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Graphics")));

        Assert.assertTrue(graphicsMenuItem.isDisplayed());
    }

    @Test
    public void mediaMenuTest() {
        // Verify Media menu item is visible
        MobileElement mediaMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Media")));

        Assert.assertTrue(mediaMenuItem.isDisplayed());
    }

    @Test
    public void nfcMenuTest() {
        // Verify NFC menu item is visible
        MobileElement nfcMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "NFC")));

        Assert.assertTrue(nfcMenuItem.isDisplayed());
    }

    @Test
    public void osMenuTest() {
        // Verify OS menu item is visible
        MobileElement osMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "OS")));

        Assert.assertTrue(osMenuItem.isDisplayed());
    }

    @Test
    public void preferenceMenuTest() {
        // Verify Preference menu item is visible
        MobileElement preferenceMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Preference")));

        Assert.assertTrue(preferenceMenuItem.isDisplayed());
    }

    @Test
    public void textMenuTest() {
        // Verify Text menu item is visible
        MobileElement textMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Text")));

        Assert.assertTrue(textMenuItem.isDisplayed());
    }

    @Test
    public void viewsMenuTest() {
        // Verify Views menu item is visible
        MobileElement viewsMenuItem = driver.findElement
                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Views")));

        Assert.assertTrue(viewsMenuItem.isDisplayed());
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
