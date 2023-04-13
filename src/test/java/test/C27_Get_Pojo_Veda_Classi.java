package test;

import baseURL.DummyBaseUrl;
import org.junit.Test;

public class C27_Get_Pojo_Veda_Classi extends DummyBaseUrl {

     /*
    http://dummy.restapiexample.com/api/v1/employee/3 url’ine bir GET request
     gonderdigimizde donen response’un asagidaki gibi oldugunu test edin.

	Response Body
    {
    "status":"success",
    "data":{
            "id":3,
            "employee_name":"Ashton Cox",
            "employee_salary":86000,
            "employee_age":66,
            "profile_image":""
            },
    "message":"Successfully! Record has been fetched."
    }

     */

    @Test
    public void get01(){

        // 1 - Url hazirla

        specDummy.pathParams("pp1","api","pp2","v1","pp3","employee","pp4",3);

        // 2 - Expected Data






    }


}
