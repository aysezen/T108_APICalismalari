package test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C08_JSONObjectVerileriCagirma {

    /*
    {
    "firstName": "John",
    "lastName": "doe",
    "age": 26,
    "address": {
        "streetAddress": "naist street",
        "city": "Nara",
        "postalCode": "630-0192"
                },
    "phoneNumbers": [
                    {
                        "type": "iPhone",
                        "number": "0123-4567-8888"
                    },
                    {
                        "type": "home",
                        "number": "0123-4567-8910"
                    }
                    ]
    }
     */

    @Test
    public void jsonPath01(){

        JSONObject cepTel = new JSONObject();
        
        cepTel.put("type", "iPhone");
        cepTel.put("number", "0123-4567-8888");

        JSONObject evTel = new JSONObject();

        evTel.put("type", "home");
        evTel.put("number", "0123-4567-8910");

        JSONArray phoneNumbers = new JSONArray();
        
        phoneNumbers.put(0,evTel);
        phoneNumbers.put(1,cepTel);
        
        JSONObject address = new JSONObject();
        
        address.put("streetAddress", "naist street");
        address.put("city", "Nara");
        address.put("postalCode", "630-0192");
        
        JSONObject kisiBilgisi = new JSONObject();
        
        kisiBilgisi.put("firstName", "John");
        kisiBilgisi.put("lastName", "doe");
        kisiBilgisi.put("age", 26);
        kisiBilgisi.put("address", address);
        kisiBilgisi.put("phoneNumbers", phoneNumbers);

        System.out.println("kisiBilgisi = " + kisiBilgisi);


        /*
        kisiBilgisi =

        {
        "firstName":"John",
        "lastName":"doe",
        "address": {
                    "streetAddress":"naist street",
                    "city":"Nara",
                    "postalCode":"630-0192"
                    },
        "age":26,
        "phoneNumbers":[
                        {
                        "number":"0123-4567-8910",
                        "type":"home"
                        },
                        {
                        "number":"0123-4567-8888",
                        "type":"iPhone"
                        }
                        ]
        }

         */

        System.out.println("Isim : " + kisiBilgisi.get("firstName"));   // John
        System.out.println("Soyisim : " + kisiBilgisi.get("lastName")); // doe
        System.out.println("Yas : " + kisiBilgisi.get("age"));          // 26
        System.out.println("Sokak Adi : " + kisiBilgisi.getJSONObject("address").get("streetAddress"));
        System.out.println("Sehir : " + kisiBilgisi.getJSONObject("address").get("city"));
        System.out.println("Posta Kodu : " + kisiBilgisi.getJSONObject("address").get("postalCode"));
        System.out.println("Tel No : " + kisiBilgisi
                                                    .getJSONArray("phoneNumbers")
                                                    .getJSONObject(0)
                                                    .get("number"));
        System.out.println("Tel Turu : " + kisiBilgisi
                                                    .getJSONArray("phoneNumbers")
                                                    .getJSONObject(0)
                                                    .get("type"));

        System.out.println("Tel Turu : " + kisiBilgisi
                                                    .getJSONArray("phoneNumbers")
                                                    .getJSONObject(1)
                                                    .get("type"));

        System.out.println("Tel No : " + kisiBilgisi
                                                    .getJSONArray("phoneNumbers")
                                                    .getJSONObject(1)
                                                    .get("number"));

    }

}
