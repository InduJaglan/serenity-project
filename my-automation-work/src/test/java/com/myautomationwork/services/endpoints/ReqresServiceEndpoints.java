package com.myautomationwork.services.endpoints;

import com.jayway.restassured.response.Response;
import com.myautomationwork.services.models.reqres.createUser.CreateUserRequestModel;
import com.myautomationwork.utilities.ServiceConfig;

public class ReqresServiceEndpoints extends ServiceConfig {
    public static Response createUser(CreateUserRequestModel createUserRequestModel) {
        return ServiceConfig.getReqresServiceUrl().body(gson().toJson(createUserRequestModel)).log().all().when().post("/api/users");
    }
}
