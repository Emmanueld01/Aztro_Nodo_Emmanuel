package org.example.repositories.prestamo;

import org.example.configs.EntityManagerPostgres;
import org.example.models.prestamo.Prestamo;
import org.example.repositories.AbstractRepository;

public class PrestamoRepository extends AbstractRepository<Prestamo> {
    public PrestamoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
