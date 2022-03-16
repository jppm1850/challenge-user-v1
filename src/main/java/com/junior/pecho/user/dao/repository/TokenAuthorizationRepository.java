package com.junior.pecho.user.dao.repository;

import com.junior.pecho.user.model.jpa.TokenAuthorization;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface TokenAuthorizationRepository extends ReactiveCrudRepository<TokenAuthorization, UUID> {

    Mono<TokenAuthorization> findByToken(String token);
}
