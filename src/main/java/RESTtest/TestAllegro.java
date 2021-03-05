package RESTtest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestAllegro {
        String token= "put_token_here";
        String url="https://api.allegro.pl";
        @Test
        public void test_01() {
            String urlCategories= url+ "/sale/categories";
            given()
                    .header("Accept","application/vnd.allegro.public.v1+json")
                    .auth()
                    .oauth2(token)
                    .when()
                    .get(urlCategories)
                    .then()
                    .assertThat()
                    .statusCode(200)
                    .log()
                    .body();
        }
        @Test
        public void test_02() {
            String urlCategories= url+ "/sale/categoriess";
            given()
                .header("Accept","application/vnd.allegro.public.v1+json")
                .auth()
                .oauth2(token)
                .when()
                .get(urlCategories)
                .then()
                .assertThat()
                .statusCode(404)
                .log()
                .body();
        }
        @Test
        public void test_03() {
            String urlCategories= url+ "/sale/categories/12";
            given()
                .header("Accept","application/vnd.allegro.public.v1+json")
                .auth()
                .oauth2(token)
                .when()
                .get(urlCategories)
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .body();
        }
        @Test
        public void test_04() {
            String urlCategories= url+ "/sale/categories/ea5b98dd-4b6f-4bd0-8c80-22c2629132d0";
            given()
                .header("Accept","application/vnd.allegro.public.v1+json")
                .auth()
                .oauth2(token)
                .when()
                .get(urlCategories)
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .body();
        }
        @Test
        public void test_05() {
            String urlCategories= url+ "/sale/categories/-0";
            given()
                .header("Accept","application/vnd.allegro.public.v1+json")
                .auth()
                .oauth2(token)
                .when()
                .get(urlCategories)
                .then()
                .assertThat()
                .statusCode(404)
                .log()
                .body();
        }
        @Test
        public void test_06() {
            String urlCategories= url+ "/sale/categories/12/parameters";
            given()
                .header("Accept","application/vnd.allegro.public.v1+json")
                .auth()
                .oauth2(token)
                .when()
                .get(urlCategories)
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .body();
        }
        @Test
        public void test_07() {
            String urlCategories= url+ "/sale/categories/ea5b98dd-4b6f-4bd0-8c80-22c2629132d0/parameters";
            given()
                .header("Accept","application/vnd.allegro.public.v1+json")
                .auth()
                .oauth2(token)
                .when()
                .get(urlCategories)
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .body();
        }
        @Test
        public void test_08() {
            String urlCategories= url+ "/sale/categories/13/parameters";
            given()
                .header("Accept","application/vnd.allegro.public.v1+json")
                .auth()
                .oauth2("token")
                .when()
                .get(urlCategories)
                .then()
                .assertThat()
                .statusCode(401)
                .log()
                .body();
        }


}
