package ui;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultsHandler extends BaseTest {

    public void clickSearchButton() {
            $("button.search__button").click();
    }

    public int getResultCount() {
        String resultText = $("div.text-2.page-lead__search-result-count").getText();

        if (resultText.isEmpty() || !resultText.matches("\\d+ результатов")) {
            return 0;
        }

        return Integer.parseInt(resultText.split(" ")[0]);
    }
}