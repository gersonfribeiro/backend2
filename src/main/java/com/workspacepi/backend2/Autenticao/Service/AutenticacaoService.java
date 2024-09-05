package com.workspacepi.backend2.Autenticao.Service;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService {
    private final JwtService jwtService;

    public AutenticacaoService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public String autenticar(Authentication authentication) {
        return jwtService.generateToken(authentication);
    }
}
