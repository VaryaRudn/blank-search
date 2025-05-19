package ui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchFunctionalityTest extends BaseTest {

    @Test
    public void testEmptySearch() {
        SearchResultsHandler searchResultsHandler = new SearchResultsHandler();
        searchResultsHandler.clickSearchButton();
        searchResultsHandler.clickSearchButton();
        int resultCount = searchResultsHandler.getResultCount();
        assertEquals(0, resultCount, "Количество результатов должно быть 0.");
    }
}
