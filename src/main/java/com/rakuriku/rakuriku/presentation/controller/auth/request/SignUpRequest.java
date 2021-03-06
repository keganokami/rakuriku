package com.rakuriku.rakuriku.presentation.controller.auth.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequest {
    private String adminId;
    private String password;
    private String emailAddress;
}
