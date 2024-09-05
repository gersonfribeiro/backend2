//package com.workspacepi.backend2.Autenticao.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.jwt.JwtEncoder;
//import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
//import org.springframework.security.oauth2.jwt.JwtDecoder;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
//
//import com.nimbusds.jose.jwk.source.ImmutableSecret;
//import com.nimbusds.jose.jwk.source.JWKSource;
//import javax.crypto.spec.SecretKeySpec;
//
//@Configuration
//public class JwtConfig {
//
//    // Define a chave secreta simétrica (use uma chave forte em produção)
//    private final String secret = "my-secret-key-which-should-be-very-strong";
//
//    @Bean
//    public JwtEncoder jwtEncoder() {
//        SecretKeySpec key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
//        JWKSource jwkSource = new ImmutableSecret<>(key);
//        return new NimbusJwtEncoder(jwkSource);
//    }
//
//    @Bean
//    public JwtDecoder jwtDecoder() {
//        SecretKeySpec key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
//        return NimbusJwtDecoder.withSecretKey(key).macAlgorithm(MacAlgorithm.HS256).build();
//    }
//}
