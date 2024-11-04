package org.example.repositories.medicamento;

import org.example.configs.EntityManagerPostgres;
import org.example.models.medicamento.Medicamento;
import org.example.repositories.AbstractRepository;

public class MedicamentoRepository extends AbstractRepository<Medicamento> {
    public MedicamentoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
