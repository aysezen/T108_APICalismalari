package test;

import baseURL.HerokuAppBaseUrl;
import org.junit.Test;
import testData.TestDataHerokuApp;

import java.util.HashMap;

public class C24_Post_Deserialization extends HerokuAppBaseUrl {
    /*
      https://restful-booker.herokuapp.com/booking url'ine asagidaki
      body'ye sahip bir POST request gonderdigimizde donen response'un
      id haric asagidaki gibi oldugunu test edin.

        Request body
   {
        "firstname" : "Ali",
        "lastname" : "Bak",
        "totalprice" : 500,
        "depositpaid" : false,
        "bookingdates" : {
                 "checkin" : "2021-06-01",
                 "checkout" : "2021-06-10"
                          },
        "additionalneeds" : "wi-fi"
    }

       Response Body
       {
       "bookingid":24,
       "booking":{
           "firstname":"Ali",
           "lastname":"Bak",
           "totalprice":500,
           "depositpaid":false,
           "bookingdates":{
               "checkin":"2021-06-01",
               "checkout":"2021-06-10"
           },
           "additionalneeds":"wi-fi"
           }
       }
   */

    @Test
    public void post01(){

        // 1 - Url ve Body hazirla

        specHerokuApp.pathParam("pp1","booking");

        TestDataHerokuApp testDataHerokuApp = new TestDataHerokuApp();

        HashMap <String,Object> reqBody = testDataHerokuApp.reqBodyMap();

        // 2 - Expected Data hazirla

        HashMap<String,Object> expBody = testDataHerokuApp.expBodyMap();

        // 3 -
    }
}
