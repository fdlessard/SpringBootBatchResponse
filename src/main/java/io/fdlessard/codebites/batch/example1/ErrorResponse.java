package io.fdlessard.codebites.batch.example1;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@Builder
public class ErrorResponse implements Serializable {

    private int status;

    private String type;

    private String message;

    private String moreInfo;

}
