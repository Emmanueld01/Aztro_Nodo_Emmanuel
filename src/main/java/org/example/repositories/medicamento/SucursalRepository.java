package org.example.repositories.medicamento;

import org.example.configs.EntityManagerPostgres;
import org.example.models.medicamento.Sucursal;
import org.example.repositories.AbstractRepository;

public class SucursalRepository extends AbstractRepository<Sucursal> {
    public SucursalRepository() {
        super(new EntityManagerPostgres<>());
    }
}
