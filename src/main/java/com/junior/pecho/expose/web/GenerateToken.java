package com.junior.pecho.expose.web;

import com.junior.pecho.user.business.AuthorizationService;
import com.junior.pecho.user.model.jpa.TokenAuthorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/tokens")
public class GenerateToken {

    @Autowired
    private AuthorizationService authorizationService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<TokenAuthorization> generateToken() {
        return authorizationService.generateToken();
    }
}
