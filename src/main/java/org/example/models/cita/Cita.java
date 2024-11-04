package org.example.models.cita;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PacienteCita paciente;

    @ManyToOne
    private MedicoCita medico;

    @ManyToOne
    private Especialidad especialidad;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;

    // Get y set
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PacienteCita getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteCita paciente) {
        this.paciente = paciente;
    }

    public MedicoCita getMedico() {
        return medico;
    }

    public void setMedico(MedicoCita medico) {
        this.medico = medico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
}
