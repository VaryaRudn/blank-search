package ui;

import static com.codeborne.selenide.Selenide.*;

public class ResultsPage extends BaseTest {

    public boolean isSearchResultDisplayed(String term) {
        return $("h2.page-lead__search-result-title").getText().contains(term); // Проверяем наличие слова в заголовке
    }
}
