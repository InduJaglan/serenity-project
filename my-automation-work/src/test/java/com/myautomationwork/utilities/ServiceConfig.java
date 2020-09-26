package com.myautomationwork.utilities;

import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

import java.net.URI;

import static com.jayway.restassured.RestAssured.given;

public class ServiceConfig {
    public static Response response;
    private static final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    public static Gson gson() {
        return new Gson();
    }

    protected static RequestSpecification getGoRestSerViceUrl() {
        String goRestServiceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("service.gorest.url");
        System.out.println(goRestServiceEndpoint);
        RestAssured.baseURI = URI.create(goRestServiceEndpoint).toString();
        return given().header("Accept", "application/json");
    }

    protected static RequestSpecification getTypeCodeServiceUrl() {
        String typeCodeServiceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("service.typicode.url");
        RestAssured.baseURI = URI.create(typeCodeServiceEndpoint).toString();
        return given().header("Accept", "application/json");
    }

    protected static RequestSpecification getTestApiExamplesServiceUrl() {
        String restApiExampleServiceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("service.restapiexample.url");
        RestAssured.baseURI = URI.create(restApiExampleServiceEndpoint).toString();
        return given().header("Accept", "application/json");
    }

    protected static RequestSpecification getReqresServiceUrl() {
        String restApiExampleServiceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("service.reqres.com");
        RestAssured.baseURI = URI.create(restApiExampleServiceEndpoint).toString();
        return given().header("Accept", "application/json");
    }
}
