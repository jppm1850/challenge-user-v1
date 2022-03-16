package com.junior.pecho.common;

import lombok.Getter;
import org.springframework.http.HttpMethod;
import org.springframework.web.util.pattern.PathPattern;
import org.springframework.web.util.pattern.PathPatternParser;

@Getter
public enum ExcludeEnpoints {

    SWAGGER_ENDPOINT("/swagger-ui.html", HttpMethod.GET),
    WEBJAR("/webjars/**", HttpMethod.GET),
    OPEN_API("/v3/api-docs", HttpMethod.GET),
    OPEN_API2("/v3/**", HttpMethod.GET),
    ACTUATOR_ENDPOINT3("/actuator/health/%7B*path%7D", HttpMethod.GET),
    ACTUATOR_ENDPOINT2("/actuator/*", HttpMethod.GET),
    ACTUATOR_ENDPOINT("/actuator", HttpMethod.GET),
    TOKEN_ENDPOINT("/v1/tokens", HttpMethod.POST);

    private final PathPattern pattern;
    private final HttpMethod httpMethod;

    ExcludeEnpoints(String path, HttpMethod httpMethod) {
        this.pattern = new PathPatternParser().parse(path);
        this.httpMethod = httpMethod;
    }
}
