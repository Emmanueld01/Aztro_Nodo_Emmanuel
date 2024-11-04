package org.example.repositories.cita;

import org.example.configs.EntityManagerPostgres;
import org.example.models.cita.Cita;
import org.example.repositories.AbstractRepository;

public class CitaRepository extends AbstractRepository<Cita> {
    public CitaRepository() {
        super(new EntityManagerPostgres<>());
    }
}
