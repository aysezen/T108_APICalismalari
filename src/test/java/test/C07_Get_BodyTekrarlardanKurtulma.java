package test;


import io.restassured.response.Response;

import org.junit.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;


public class C07_Get_BodyTekrarlardanKurtulma {

         /*
                https://restful-booker.herokuapp.com/booking/10 url’ine
                bir GET request gonderdigimizde donen Response’un,

                status code’unun 200,
                ve content type’inin application/json; charset=utf-8,
                ve response body’sindeki
                    "firstname“in,"Jim",
                    ve "lastname“in, "Wilson",
                    ve "totalprice“in, 609,
                    ve "depositpaid“in,false,
                    ve "additionalneeds“in,"Breakfast"
                oldugunu test edin


         */

    @Test
    public void get01(){

        // 1 - Request icin gerekli url hazirla

        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2 - Expected Data hazirla

        // 3 - Response'i kaydet

        Response response = given().when().get(url);

        response.prettyPrint();

        // 4 - Assertion

        /*
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("firstname", Matchers.equalTo("Mark"),
                        "lastname",Matchers.equalTo("Jackson"),
                        "totalprice",Matchers.equalTo(233),
                        "depositpaid",Matchers.equalTo(false),
                        "additionalneeds",Matchers.equalTo("Breakfast")
                        );

         */


        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("firstname",equalTo("Mark"),
                        "lastname",equalTo("Jackson"),
                        "totalprice",equalTo(233),
                        "depositpaid",equalTo(false),
                        "additionalneeds",equalTo("Breakfast")
                );

    }

}
