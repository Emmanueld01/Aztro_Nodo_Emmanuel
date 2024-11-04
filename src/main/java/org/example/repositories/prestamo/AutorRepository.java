package org.example.repositories.prestamo;

import org.example.configs.EntityManagerPostgres;
import org.example.models.prestamo.Autor;
import org.example.repositories.AbstractRepository;

public class AutorRepository extends AbstractRepository<Autor> {
    public AutorRepository() {
        super(new EntityManagerPostgres<>());
    }
}