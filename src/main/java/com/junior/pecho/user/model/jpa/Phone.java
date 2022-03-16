package com.junior.pecho.user.model.jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;


@Table("phone")
@Getter
@Setter
@Builder
public class Phone {

    @Id
    private Long id;
    @Column ("user_id")
    private UUID userId;
    @Column("phone_number")
    private String phoneNumber;
    @Column("city_code")
    private String cityCode;
    @Column("country_code")
    private String country;
}
