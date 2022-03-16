package com.junior.pecho.user.web;

import com.junior.pecho.user.model.api.PhoneRequest;
import com.junior.pecho.user.model.api.UserRequest;
import com.junior.pecho.user.model.api.UserResponse;
import com.junior.pecho.user.utils.Constants;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    private WebTestClient client;

    @Test
    void saveFiles() {

        List<PhoneRequest> phones = new ArrayList<>();
        PhoneRequest phone = new PhoneRequest();
        phone.setCityCode("01");
        phone.setNumber("95108399");
        phone.setCountryCode("CH");
        phones.add(phone);

        phone = new PhoneRequest();
        phone.setCityCode("02");
        phone.setNumber("98833677");
        phone.setCountryCode("PE");
        phones.add(phone);


        phone = new PhoneRequest();
        phone.setCityCode("03");
        phone.setNumber("998348746");
        phone.setCountryCode("ES");
        phones.add(phone);

        UserRequest request = new UserRequest();
        request.setEmail("jppm1850@gmail.com");
        request.setName("peter chest");
        request.setPassword("123");
        request.setPhones(phones);

        client.post()
                .uri("/v1/users")
                .header(Constants.AUTHORIZATION, "ueyuy-ueyweyu-iueii-ieuiu")
                .body(Mono.just(request),UserRequest.class)
                .exchange()
                .expectStatus().isCreated()
                .expectBody(UserResponse.class);

    }

    @Test
    void errorToken() {

        List<PhoneRequest> phones = new ArrayList<>();
        PhoneRequest phone = new PhoneRequest();
        phone.setCityCode("01");
        phone.setNumber("95108399");
        phone.setCountryCode("CH");
        phones.add(phone);

        phone = new PhoneRequest();
        phone.setCityCode("02");
        phone.setNumber("98833677");
        phone.setCountryCode("PE");
        phones.add(phone);

        phone = new PhoneRequest();
        phone.setCityCode("03");
        phone.setNumber("998348746");
        phone.setCountryCode("ES");
        phones.add(phone);

        UserRequest request = new UserRequest();
        request.setEmail("jppm1850@gmail.com");
        request.setName("peter chest");
        request.setPassword("123");
        request.setPhones(phones);

        client.post()
                .uri("/v1/users")
                .header(Constants.AUTHORIZATION, "ueyuy-455-iueii-ieu122")
                .body(Mono.just(request),UserRequest.class)
                .exchange()
                .expectStatus().isUnauthorized();

    }

}