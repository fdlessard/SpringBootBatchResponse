package io.fdlessard.codebites.batch.domain;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@Builder
public class Customer implements Serializable {

    private String id;

    private String firstName;

    private String lastName;

    private String company;

}
