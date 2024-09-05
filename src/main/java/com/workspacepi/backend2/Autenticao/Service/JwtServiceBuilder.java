package com.workspacepi.backend2.Autenticao.Service;

import org.springframework.security.oauth2.jwt.JwtEncoder;

public class JwtServiceBuilder {
    private JwtEncoder encoder;

    public JwtServiceBuilder setEncoder(JwtEncoder encoder) {
        this.encoder = encoder;
        return this;
    }

    public JwtService createJwtService() {
        return new JwtService(encoder);
    }
}
