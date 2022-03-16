package com.junior.pecho.user.model.api;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserRequest {

    private String name;
    private String email;
    private String password;
    private List<PhoneRequest> phones;
}
