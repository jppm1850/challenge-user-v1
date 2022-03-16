package com.junior.pecho.user.model.api;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Builder
public class UserResponse {

    private String id;
    private Instant created;
    private Instant modified;
    private Instant lastLogin;
    private String token;
    private Boolean active;
}
