package com.junior.pecho.user.business.impl;

import com.junior.pecho.user.business.AuthorizationService;
import com.junior.pecho.user.model.jpa.TokenAuthorization;
import com.junior.pecho.user.dao.repository.TokenAuthorizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class AuthorizathionService implements AuthorizationService {

    @Autowired
    private TokenAuthorizationRepository authorizationRepository;

    public Mono<TokenAuthorization> validateToken(String token) {
        return authorizationRepository.findByToken(token);

    }

    public Mono<TokenAuthorization> generateToken() {

        return authorizationRepository.save(TokenAuthorization.builder()
                .token(UUID.randomUUID().toString()).build());

    }
}
