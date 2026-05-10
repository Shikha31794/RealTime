import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.ResponseModal;
import service.RequestAPI;

public class PostTest {

    RequestAPI rs = new RequestAPI();

    @Test
    public void testGet() {
        Response response = rs.get("/posts");
        System.out.println(response.statusCode());
    }

    @Test
    public void testGetById() {
        Response response = rs.getById("/posts", 1);
        System.out.println(response.asString());
    }

    @Test
    public void testPost() {
//        Response response = rs.post("/posts", "{}");
//        System.out.println(response.statusCode());

//    PostRequest request = new PostRequest();
//request.setUserId(1);
//request.setTitle("Test");
//request.setBody("Automation");

    ResponseModal response = rs.post("/posts", "{}");
//        System.out.println(rs.post("/posts", "{}").asS
//                System.out.println(response.getId());
    }}
