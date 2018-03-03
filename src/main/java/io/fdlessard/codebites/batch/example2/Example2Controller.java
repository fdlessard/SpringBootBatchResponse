package io.fdlessard.codebites.batch.example2;


import io.fdlessard.codebites.batch.domain.Customer;
import io.fdlessard.codebites.batch.domain.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("example2")
public class Example2Controller {


    @GetMapping("/customer")
    public List<ResponseEntity> getAllCustomers() {

        List<ResponseEntity> responses = new ArrayList<>();

        Customer customer = Customer.builder()
                .id("id1")
                .firstName("firstName1")
                .lastName("lastName1")
                .company("company1")
                .build();
        responses.add(ResponseEntity.ok(customer));

        ErrorResponse errorResponse = ErrorResponse.builder()
                .status(400)
                .type("Some type")
                .message("Issue With Customer 2")
                .moreInfo("http://www.error.com")
                .build();
        responses.add(ResponseEntity.badRequest().body(errorResponse));

        customer = Customer.builder()
                .id("id3")
                .firstName("firstName3")
                .lastName("lastName3")
                .company("company3")
                .build();

        responses.add(ResponseEntity.ok(customer));


        return responses;
    }
}
