package com.wannago.util.jwt;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenDto {

    private String accessToken;
    private String refreshToken;

    public TokenDto(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }
}
