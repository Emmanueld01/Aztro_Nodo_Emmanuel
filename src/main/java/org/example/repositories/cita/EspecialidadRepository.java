package org.example.repositories.cita;

import org.example.configs.EntityManagerPostgres;
import org.example.models.cita.Especialidad;
import org.example.repositories.AbstractRepository;

public class EspecialidadRepository extends AbstractRepository<Especialidad> {
    public EspecialidadRepository() {
        super(new EntityManagerPostgres<>());
    }
}
