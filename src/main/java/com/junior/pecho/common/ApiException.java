package com.junior.pecho.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import reactor.core.publisher.Mono;


@Setter
@Getter
@Builder
public class ApiException extends RuntimeException{

    private final String description;
    private final int statusCode;
    private final String systemCode;
}
