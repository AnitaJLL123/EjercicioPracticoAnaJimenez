package com.test.automation.model.e2eMobile;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginModel {
    private String usuario;
    private String password;
}
