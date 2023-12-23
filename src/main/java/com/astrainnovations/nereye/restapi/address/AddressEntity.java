package com.astrainnovations.nereye.restapi.address;

import com.astrainnovations.nereye.restapi.commons.BaseEntityAudit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "address")
public class AddressEntity extends BaseEntityAudit {
    @Column(name = "country", length = 50)
    private String country;

    @Column(name = "city", length = 25)
    private String city;

    @Column(name = "county", length = 25)
    private String county;

    @Column(name = "district", length = 25)
    private String district;

    @Column(name = "full_address", length = 200)
    private String fullAddress;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;
}
