package com.junior.pecho.user.model.api;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PhoneRequest {

    private String number;
    private String cityCode;
    private String countryCode;
}
