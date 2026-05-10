package clientAPI;

import configManager.Config;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static configManager.Config.baseUrl;


public class ActualAPI {

   public Response getAPI(String path){
       return RestAssured.given()

               .baseUri(baseUrl)
               .when().get(path);
   }
   public Response postAPI(String path , Object body){
       return RestAssured.given()

               .baseUri(baseUrl).body(body)
               .when().post(path);
   }
   }





