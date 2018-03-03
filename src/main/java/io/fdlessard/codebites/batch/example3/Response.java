package io.fdlessard.codebites.batch.example3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;


@Data
@AllArgsConstructor
@ToString
@Builder
public class Response<T extends Serializable, E extends Serializable> implements Serializable {

    private int status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, String> headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private E error;

}
