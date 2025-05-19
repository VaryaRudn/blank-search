package ui;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class GlavPage extends BaseTest{
    public ContactPage contactRedirect(){
        $x("//div[@class='sidebar-link__link'][contains(., 'Контакты')]").click();
        $x("//a[@class='sidebar-link__wrapper-link'][contains(., 'Контакты')]").click();
        return page(ContactPage.class);
    }
}

