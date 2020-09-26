package com.myautomationwork.steps.services;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import com.myautomationwork.services.endpoints.GoRestServiceEndpoints;
import com.myautomationwork.services.models.goRest.getComments.GetCommentsResponseModel;
import com.myautomationwork.utilities.ServiceConfig;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;

import static com.myautomationwork.utilities.ServiceConfig.gson;

public class GoRestServiceSteps {
    private GetCommentsResponseModel getCommentsResponseModel;

    @When("I send request to get comment")
    public void iSendRequestToGetComment() {
        ServiceConfig.response = GoRestServiceEndpoints.getAllComments();
        Assert.assertEquals(200, ServiceConfig.response.statusCode());
        getCommentsResponseModel = gson().fromJson(ServiceConfig.response.body().prettyPrint(), GetCommentsResponseModel.class);
    }

    @Then("I can see all comment of specific user")
    public void iCanSeeAllCommentOfSpecificUser() {
        Arrays.asList(getCommentsResponseModel.getData()).forEach(data -> {
            System.out.println(data.getEmail());
        });
        System.out.println(getCommentsResponseModel.getMeta().getPagination().getTotal());
    }
}
