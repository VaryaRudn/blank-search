package ui;

import org.junit.jupiter.api.Test;

public class CheckError extends BaseTest {


    @Test
    public void testSearchFunctionality() {
        String searchTerm = "Истор";

        SearchPage searchPage = new SearchPage();
        searchPage.clickSearchButton();
        ResultsPage resultsPage = searchPage.enterSearchTerm(searchTerm);

    }
}

