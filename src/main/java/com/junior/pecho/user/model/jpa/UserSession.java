package com.junior.pecho.user.model.jpa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Table("user_session")
@Getter
@Setter
@Builder
public class UserSession {

    @Id
    private Long id;
    @Column ("user_id")
    private UUID userId;
    @Column ("last_login")
    private Instant lastLogin;
    @Column("token")
    private String token;

}
