package org.example.model;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;

    private String state;

    private String zipCode;

    private String city;

    private Integer number;

    private String complement;

    private String addressLine;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;
}
