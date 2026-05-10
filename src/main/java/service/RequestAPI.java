package service;

import clientAPI.ActualAPI;
import io.restassured.response.Response;
import pojo.ResponseModal;

public class RequestAPI {

    ActualAPI api = new ActualAPI();

    public Response get(String path) {
        return api.getAPI(path);
    }

    public Response getById(String path, int id) {
        return api.getAPI(path + "/" + id);
    }

    public ResponseModal post(String path, Object body) {
        return api.postAPI(path, body).as(ResponseModal.class);
    }
}

//import pojo.request.PostRequest;
//import pojo.response.PostResponse;
//
//public PostResponse createPost(PostRequest body) {
//    return api.postAPI("/posts", body)
//            .as(PostResponse.class);
//}