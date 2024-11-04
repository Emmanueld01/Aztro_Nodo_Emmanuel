package org.example.repositories.medicamento;

import org.example.configs.EntityManagerPostgres;
import org.example.models.medicamento.Medico;
import org.example.repositories.AbstractRepository;

public class MedicoRepository extends AbstractRepository<Medico> {
    public MedicoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
