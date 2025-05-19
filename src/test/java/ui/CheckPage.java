package ui;

import com.codeborne.selenide.SelenideElement; import static com.codeborne.selenide.Selenide.$;

public class CheckPage extends BaseTest {

    private SelenideElement headerTitle = $("h1.h-1.page-lead__head-title");

    public boolean isElementPresent() {
        return headerTitle.exists();
    }
}
