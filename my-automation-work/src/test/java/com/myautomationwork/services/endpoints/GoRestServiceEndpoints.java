package com.myautomationwork.services.endpoints;

import com.jayway.restassured.response.Response;
import com.myautomationwork.utilities.ServiceConfig;

public class GoRestServiceEndpoints extends ServiceConfig {
    public static Response getAllComments() {
        return ServiceConfig.getGoRestSerViceUrl().log().all().when().get("/public-api/comments");
    }
}
