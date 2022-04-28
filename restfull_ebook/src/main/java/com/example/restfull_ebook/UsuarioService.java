package com.example.restfull_ebook;

import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> buscarPorEmail(String email);
}
