package com.junior.pecho.user.model.jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;


@Table("users")
@Getter
@Setter
@Builder
public class User {

    @Id
    private UUID id;
    private String name;
    private String email;
    private String password;
    private Boolean enabled;
    private Instant created;
    private Instant modified;


}
