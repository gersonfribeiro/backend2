package com.workspacepi.backend2.controllers;
import com.workspacepi.backend2.entity.Endereco;
import com.workspacepi.backend2.entity.Usuario;
import com.workspacepi.backend2.repositories.EnderecoRepository;
import com.workspacepi.backend2.repositories.UsuarioRepository;
import com.workspacepi.backend2.service.CadastroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/registro")
public class CadastroUsuarioController {

    @Autowired
    private CadastroUsuarioService cadastroUsuarioService;

    @PostMapping("/usuario/{usuarioId}/endereco")
    public Endereco adicionarEnderecoParaUsuario(@PathVariable Long usuarioId, @RequestBody Endereco endereco) {
        return cadastroUsuarioService.adicionarEnderecoParaUsuario(usuarioId, endereco);
    }

    @GetMapping("/cep/{cep}")
    public ResponseEntity<Endereco> buscarCep(@PathVariable String cep) {
        if (cep == null || cep.length() != 8 || !cep.matches("\\d{8}")) {
            return ResponseEntity.badRequest().build();  // Retorna 400 Bad Request se o CEP for inválido
        }

        Endereco endereco = cadastroUsuarioService.buscarEnderecoPorCep(cep);
        if (endereco == null) {
            return ResponseEntity.notFound().build();  // Retorna 404 Not Found se o CEP não for encontrado
        }

        return ResponseEntity.ok(endereco);  // Retorna 200 OK com o endereço encontrado
    }

}
