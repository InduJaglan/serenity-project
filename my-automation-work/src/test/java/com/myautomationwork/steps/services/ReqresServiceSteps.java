package com.myautomationwork.steps.services;

import com.myautomationwork.services.endpoints.ReqresServiceEndpoints;
import com.myautomationwork.services.models.reqres.createUser.CreateUserRequestModel;
import com.myautomationwork.services.models.reqres.createUser.CreateUserResponseModel;
import com.myautomationwork.services.models.reqres.doregister.DoRegistrationRequestModel;
import com.myautomationwork.utilities.RandomGenerator;
import com.myautomationwork.utilities.ServiceConfig;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.text.RandomStringGenerator;
import org.junit.Assert;

import static com.myautomationwork.utilities.ServiceConfig.gson;

public class ReqresServiceSteps {
    private CreateUserResponseModel createUserResponseModel;

    @When("I send request to create user with valid data")
    public void iSendRequestToCreateUserWithValidData(DataTable dataTable) {
        String expectedName = dataTable.asMaps().get(0).get("user");
        String expectedJob = dataTable.asMaps().get(0).get("job");
        CreateUserRequestModel createUserRequestModel = new CreateUserRequestModel();
        createUserRequestModel.setName(expectedName);
        createUserRequestModel.setJob(expectedJob);
        ServiceConfig.response = ReqresServiceEndpoints.createUser(createUserRequestModel);
        Assert.assertEquals(201, ServiceConfig.response.statusCode());
    }

    @Then("I can see created user data in to response")
    public void iCanSeeUserInToResponse() {
        CreateUserResponseModel createUserResponseModel = gson().fromJson(ServiceConfig.response.body().prettyPrint(), CreateUserResponseModel.class);
        System.out.println(createUserResponseModel.getId());
        System.out.println(createUserResponseModel.getCreatedAt());
    }

    @When("I sends request to do registration")
    public void iSendsRequestToDoRegistration() {
        DoRegistrationRequestModel doRegistrationRequestModel = new DoRegistrationRequestModel();
        doRegistrationRequestModel.setEmail("testemail" + RandomGenerator.randomAlphabetic(3) + "@mailinator.com");
        doRegistrationRequestModel.setPassword(RandomGenerator.randomAlphabetic(10));
        ServiceConfig.response = 
    }

    @Then("I see response for successful registration")
    public void iSeeResponseForSuccessfulRegistration() {

    }
}
