package org.example.repositories.medicamento;

import org.example.configs.EntityManagerPostgres;
import org.example.models.medicamento.VentaMedicamento;
import org.example.repositories.AbstractRepository;

public class VentaMedicamentoRepository extends AbstractRepository<VentaMedicamento> {
    public VentaMedicamentoRepository() {
        super(new EntityManagerPostgres<>());
    }
}