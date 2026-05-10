import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import java.sql.*;

public class APIDB {

    public static void main(String[] args) throws SQLException {

        Response rs = RestAssured.get("https://jsonplaceholder.typicode.com/users/1");

        System.out.println(rs.asString());
        Assert.assertEquals(rs.getStatusCode(), 200);

        int apiId = rs.jsonPath().getInt("id");
        String apiName = rs.jsonPath().getString("name");
        String apiEmail = rs.jsonPath().getString("email");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/userdb",
                "root",
                "root123");

        System.out.println("DB Connected Successfully");


        ResultSet rs1=con.createStatement().executeQuery( "SELECT * FROM user WHERE id = 1");
        rs1.next();

        System.out.println(rs1.getString("email"));
        int dbId = rs1.getInt("id");
        String dbName = rs1.getString("name");
        String dbEmail = rs1.getString("email");

        Assert.assertEquals(apiId, dbId);
        Assert.assertEquals(apiName, dbName);
        Assert.assertEquals(apiEmail, dbEmail);
        System.out.println("Status Code Validated");
        System.out.println("ID Matched");
        System.out.println("Name Matched");
        System.out.println("Email Matched");


}}
