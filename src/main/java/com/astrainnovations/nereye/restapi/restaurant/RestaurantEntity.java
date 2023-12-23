package com.astrainnovations.nereye.restapi.restaurant;

import com.astrainnovations.nereye.restapi.address.AddressEntity;
import com.astrainnovations.nereye.restapi.customer.CustomerEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "restaurant")
public class RestaurantEntity {
    private String photoUrl;
    private String signName;
    private AddressEntity address;
    private List<Class> categories;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;
}
