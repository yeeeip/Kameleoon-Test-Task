package com.nuzhd.techtask.model;

import lombok.Getter;

@Getter
public class UserCreationRequest {

    private String username;
    private String email;
    private String password;

}