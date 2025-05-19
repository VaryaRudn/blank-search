package ui;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage extends BaseTest {

    public void clickSearchButton() {
        $("button.search__button").click();
    }

    public ResultsPage enterSearchTerm(String term) {
        $("input.search__input").setValue(term).pressEnter();
        return new ResultsPage();
    }
}
