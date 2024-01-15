//package com.sap.cloud.sdk.tutorial;
//
//import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
//import com.github.tomakehurst.wiremock.junit5.WireMockTest;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultDestinationLoader;
//import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultHttpDestination;
//import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
//import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
//
//import static com.github.tomakehurst.wiremock.client.WireMock.anyUrl;
//import static com.github.tomakehurst.wiremock.client.WireMock.get;
//import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
//import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
//
//@WireMockTest
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class BusinessPartnerControllerTest {
//    private static final String DESTINATION_NAME = "MyErpSystem";
//    private Destination destination;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    private static final String ODATA_RESPONSE_JSON = """
//            {
//              "d": {
//                "results": [
//                  {
//                    "__metadata": {
//                      "id": "https://127.0.0.1/path/to/service(100)",
//                      "uri": "https://127.0.0.1/path/to/service(100)",
//                      "type": "API_BUSINESS_PARTNER.A_BusinessPartnerType"
//                    },
//                    "BusinessPartner": "100",
//                    "CreationDate": "/Date(1662336000000)/",
//                    "FirstName": "John",
//                    "LastName": "Peter",
//                    "IsMale": "true",
//                    "IsFemale": "false"
//                  }
//                ]
//              }
//            }
//            """;
//
//    private static final String RESPONSE_JSON = """
//            [{
//              "BusinessPartner":"100",
//              "FirstName":"John",
//              "IsMale":false,
//              "IsFemale":false,
//              "LastName":"Peter",
//              "CreationDate":"/Date(1662336000000)/"
//            }]""";
//
//    @BeforeEach
//    void before( final WireMockRuntimeInfo wm ){
//        destination = DefaultHttpDestination.builder(wm.getHttpBaseUrl()).name(DESTINATION_NAME).build();
//        final DefaultDestinationLoader defaultDestinationLoader = new DefaultDestinationLoader().registerDestination(destination);
//        DestinationAccessor.prependDestinationLoader(defaultDestinationLoader);
//    }
//
//    @Test
//    public void testService() throws Exception {
//        stubFor(get(anyUrl())
//                .willReturn(okJson(ODATA_RESPONSE_JSON)));
//        mockMvc.perform(MockMvcRequestBuilders.get("/businesspartners"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().json(RESPONSE_JSON));
//    }
//    @Test
//    public void testWithFallback() throws Exception {
//        // Assure an empty list is returned as fallback
//        mockMvc.perform(MockMvcRequestBuilders.get("/businesspartners"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().json("[]"));
//    }
//}
