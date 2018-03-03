package io.fdlessard.codebites.batch.example3;


import io.fdlessard.codebites.batch.domain.Customer;
import io.fdlessard.codebites.batch.domain.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("example3")
public class Example3Controller {


    @GetMapping("/customer")
    public List<Response> getAllCustomers() {

        List<Response> responses = new ArrayList<>();

        Customer customer = Customer.builder()
                .id("id1")
                .firstName("firstName1")
                .lastName("lastName1")
                .company("company1")
                .build();
        responses.add(buildResponse(customer));

        ErrorResponse errorResponse = ErrorResponse.builder()
                .status(400)
                .type("Some type")
                .message("Issue With Customer 2")
                .moreInfo("http://www.error.com")
                .build();
        responses.add(buildResponse(errorResponse));

        customer = Customer.builder()
                .id("id3")
                .firstName("firstName3")
                .lastName("lastName3")
                .company("company3")
                .build();
        responses.add(buildResponse(customer));

        return responses;
    }

    private Response buildResponse(Customer customer) {
        return Response.builder()
                .status(200)
                .body(customer)
                .build();
    }

    private Response buildResponse(ErrorResponse errorResponse) {
        return Response.builder()
                .status(400)
                .error(errorResponse)
                .build();
    }

}
