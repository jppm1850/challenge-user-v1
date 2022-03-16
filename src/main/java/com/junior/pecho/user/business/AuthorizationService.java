package com.junior.pecho.user.business;

import com.junior.pecho.user.model.jpa.TokenAuthorization;
import reactor.core.publisher.Mono;


public interface AuthorizationService {

    Mono<TokenAuthorization> validateToken(String token);
    Mono<TokenAuthorization> generateToken();
}
