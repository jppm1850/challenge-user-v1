package com.junior.pecho.config;


import com.junior.pecho.common.ApiException;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.autoconfigure.web.reactive.error.AbstractErrorWebExceptionHandler;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;


@Component
@Order(-9)
public class GlobantErrorExceptionHandler extends AbstractErrorWebExceptionHandler {


    public GlobantErrorExceptionHandler(ErrorAttributes errorAttributes, WebProperties.Resources resources, ApplicationContext applicationContext, ServerCodecConfigurer configurer) {
        super(errorAttributes, resources, applicationContext);
        this.setMessageWriters(configurer.getWriters());
    }

    @Override
    protected RouterFunction<ServerResponse> getRoutingFunction(ErrorAttributes errorAttributes) {

        return RouterFunctions.route(RequestPredicates.all(), this::renderErrorResponse);
    }

    private Mono<ServerResponse> renderErrorResponse(ServerRequest request) {
        var exception = this.getError(request);
        Map<String,Object> errorMap= new HashMap();
        HttpStatus httpStatus=null;

        if(exception instanceof ApiException){

            ApiException apiException=(ApiException) exception;

            httpStatus=HttpStatus.valueOf(apiException.getStatusCode());
            errorMap.put("message",apiException.getDescription());

        }else{
            httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
            errorMap.put("message","CONTACTESE_AL_2333");
        }

        return ServerResponse.status(httpStatus).contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue(errorMap));
    }
}
