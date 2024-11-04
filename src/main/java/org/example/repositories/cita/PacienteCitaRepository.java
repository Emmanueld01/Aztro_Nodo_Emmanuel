package org.example.repositories.cita;

import org.example.configs.EntityManagerPostgres;
import org.example.models.cita.PacienteCita;
import org.example.repositories.AbstractRepository;

public class PacienteCitaRepository extends AbstractRepository<PacienteCita> {
    public PacienteCitaRepository() {
        super(new EntityManagerPostgres<>());
    }
}
