package com.workspacepi.backend2.Autenticao.Controller;

import com.workspacepi.backend2.Autenticao.Service.AutenticacaoService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutenticacaoController {
    private final AutenticacaoService autenticacaoService;

    public AutenticacaoController(AutenticacaoService autenticacaoService) {
        this.autenticacaoService = autenticacaoService;
    }

    @PostMapping("autenticacao")
    public String autenticao(Authentication authentication) {
        return autenticacaoService.autenticar(authentication);
    }
}
