package org.example.repositories.cita;

import org.example.configs.EntityManagerPostgres;
import org.example.models.cita.MedicoCita;
import org.example.repositories.AbstractRepository;

public class MedicoCitaRepository extends AbstractRepository<MedicoCita> {
    public MedicoCitaRepository() {
        super(new EntityManagerPostgres<>());
    }
}
