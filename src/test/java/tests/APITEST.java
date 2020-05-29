package tests;

import com.jayway.restassured.response.Response;
import jnr.ffi.Struct;
import org.apache.xpath.operations.String;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static com.jayway.restassured.RestAssured.given;

public class APITEST {
    static java.lang.String DEFAULT_URL = "https://jsonplaceholder.typicode.com/posts";
    static java.lang.String CONTENT_TYPE = "Content-type";
    static java.lang.String HEADER_APP_JSON = "application/json; charset=utf-8";
    Response response;
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void verifyHTTPSStatusCode200() {
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then().assertThat().statusCode(200);
        // проверка что страница нам отвечает
    }
}
