package org.example.repositories.prestamo;

import org.example.configs.EntityManagerPostgres;
import org.example.models.prestamo.Libro;
import org.example.repositories.AbstractRepository;

public class LibroRepository extends AbstractRepository<Libro> {
    public LibroRepository() {
        super(new EntityManagerPostgres<>());
    }
}