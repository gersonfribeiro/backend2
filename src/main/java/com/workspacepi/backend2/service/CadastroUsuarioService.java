package com.workspacepi.backend2.service;

import com.workspacepi.backend2.entity.Endereco;
import com.workspacepi.backend2.entity.Usuario;
import com.workspacepi.backend2.repositories.EnderecoRepository;
import com.workspacepi.backend2.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class CadastroUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    private static final String VIA_CEP_URL = "https://viacep.com.br/ws/{cep}/json/";

    public Endereco buscarEnderecoPorCep(String cep) throws HttpClientErrorException {
        RestTemplate restTemplate = new RestTemplate();
        try {
            return restTemplate.getForObject(VIA_CEP_URL, Endereco.class, cep);
        } catch (HttpClientErrorException e) {
            return null;
        }
    }

    public Endereco adicionarEnderecoParaUsuario(Long usuarioId, Endereco endereco) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            endereco.setUsuario(usuario); // Associa o endereço ao usuário
            return enderecoRepository.save(endereco); // Salva o endereço
        } else {
            throw new RuntimeException("Usuário não encontrado");
        }
    }
}
