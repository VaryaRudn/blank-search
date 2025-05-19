package ui;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CorrectNumb extends BaseTest {

    private String paginationItems = "div.page-pagination__list button.page-pagination__item";
    private String currentPageButton = "div.page-pagination__list button.page-pagination__item[aria-current='true']";
    private String nextPageButton = "button.page-pagination__next";

    public boolean isCurrentPageNumberCorrect(int expectedPageNumber) {
        String currentPageText = $(currentPageButton).getText().trim();

        if (currentPageText.isEmpty()) {
            return false;
        }

        try {
            return Integer.parseInt(currentPageText) == expectedPageNumber;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void goToNextPage() {
        $(nextPageButton).shouldBe(visible).click();
    }

    public boolean isLastPage() {
        return $$(paginationItems).last().getText().equals(String.valueOf($$(paginationItems).size()));
    }
}