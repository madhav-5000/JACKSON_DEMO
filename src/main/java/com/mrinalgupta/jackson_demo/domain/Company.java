package com.mrinalgupta.jackson_demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Column(name = "company_name")
    private String name;
    private String catchPhrase;
    private String bs;
}
