package com.astrainnovations.nereye.restapi.customer;

import com.astrainnovations.nereye.restapi.address.AddressEntity;
import com.astrainnovations.nereye.restapi.commons.BaseEntityAudit;
import com.astrainnovations.nereye.restapi.restaurant.RestaurantEntity;
import com.astrainnovations.nereye.restapi.user.UserEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
public class CustomerEntity extends BaseEntityAudit {
    @Column(name = "company_name", length = 75)
    private String companyName;

    @Column(name = "customer_type", length = 50)
    private String customerType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @OneToOne(mappedBy = "customer", orphanRemoval = true)
    private List<RestaurantEntity> restaurants;
}
