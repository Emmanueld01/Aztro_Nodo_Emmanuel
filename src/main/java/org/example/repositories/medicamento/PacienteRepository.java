package org.example.repositories.medicamento;

import org.example.configs.EntityManagerPostgres;
import org.example.models.medicamento.Paciente;
import org.example.repositories.AbstractRepository;

public class PacienteRepository extends AbstractRepository<Paciente> {
    public PacienteRepository() {
        super(new EntityManagerPostgres<>());
    }
}
