package io.fdlessard.codebites.batch.example4;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;


@Data
@AllArgsConstructor
@ToString
public class Response implements Serializable {

    private int status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, String> headers;

    private Body body;

}
