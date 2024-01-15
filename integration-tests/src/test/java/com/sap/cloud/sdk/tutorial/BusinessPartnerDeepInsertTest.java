//package com.sap.cloud.sdk.tutorial;
//
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import io.restassured.module.mockmvc.RestAssuredMockMvc;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.not;
//import static org.hamcrest.Matchers.isEmptyString;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//public class BusinessPartnerDeepInsertTest
//{
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @BeforeEach
//    public void setUp() {
//        RestAssured.reset();
//        RestAssuredMockMvc.mockMvc(mockMvc);
//    }
//
//
//    @Test
//    public void testStoreAndGetCustomers()
//    {
//        given()
//                .contentType(ContentType.JSON)
//                .params("firstname", "John", "lastname", "Doe", "country", "US", "city", "Tuxedo", "email", "john@doe.com")
//                .when()
//                .post("/businessPartners")
//                .then()
//                .log().all()
//                .statusCode(201)
//                .and()
//                .body("BusinessPartner", not(isEmptyString()))
//                .and()
//                .body("BusinessPartnerUUID", not(isEmptyString()));
//    }
//}
