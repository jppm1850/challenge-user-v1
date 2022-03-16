package com.junior.pecho.user.business;


import com.junior.pecho.user.model.api.UserRequest;
import com.junior.pecho.user.model.api.UserResponse;

import reactor.core.publisher.Mono;

public interface UserService {

    Mono<UserResponse> saveUser(UserRequest request, String authorizathion);
}
