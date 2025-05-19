package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTest {
    public static void main(String[] args) {

        String url = "https://jsonplaceholder.typicode.com/posts/1";
        Response response = RestAssured.get(url);
        int statusCode = response.getStatusCode();
        if (statusCode == 200) {
            System.out.println("Ссылка доступна: " + url);
        } else {
            System.out.println("Ссылка недоступна. Статус-код: " + statusCode);
            System.exit(1);
        }
    }
}
