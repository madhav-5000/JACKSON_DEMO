package com.mrinalgupta.jackson_demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address  {

    private String street;
    private String suite;
    private String city;
    private String zipcode;

    @Embedded
    private Geo geo;


}
