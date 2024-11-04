package org.example.repositories.prestamo;

import org.example.configs.EntityManagerPostgres;
import org.example.models.prestamo.Usuario;
import org.example.repositories.AbstractRepository;

public class UsuarioRepository extends AbstractRepository<Usuario> {
    public UsuarioRepository() {
        super(new EntityManagerPostgres<>());
    }
}
