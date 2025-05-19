

package ui;

import org.junit.jupiter.api.Test;

public class ContactTest extends BaseTest {

    @Test
    public void testMarketPageNavigation() {
        MainPage mainPage = new MainPage();
        MarketPage marketPage = mainPage.clickMarketLink();
        marketPage.checkLogoIsVisible();
    }
}