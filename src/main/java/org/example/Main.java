package org.example;

import org.example.models.cita.*;
import org.example.models.medicamento.*;
import org.example.models.prestamo.*;
import org.example.repositories.cita.*;
import org.example.repositories.medicamento.*;
import org.example.repositories.prestamo.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Repositorios de Prestamo de Libros
        LibroRepository libroRepository = new LibroRepository();
        AutorRepository autorRepository = new AutorRepository();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        PrestamoRepository prestamoRepository = new PrestamoRepository();

        // Repositorios de Venta de Medicamentos
        MedicamentoRepository medicamentoRepository = new MedicamentoRepository();
        MedicoRepository medicoRepository = new MedicoRepository();
        PacienteRepository pacienteRepository = new PacienteRepository();
        SucursalRepository sucursalRepository = new SucursalRepository();
        VentaMedicamentoRepository ventaMedicamentoRepository = new VentaMedicamentoRepository();

        // Repositorios de Gestión de Citas Médicas
        PacienteCitaRepository pacienteCitaRepository = new PacienteCitaRepository();
        MedicoCitaRepository medicoCitaRepository = new MedicoCitaRepository();
        CitaRepository citaRepository = new CitaRepository();
        EspecialidadRepository especialidadRepository = new EspecialidadRepository();

        // Registros de Prestamo de Libros
        Autor autor = new Autor();
        autor.setNombre("Stephen King");
        autor.setBiografia("Autor de 'IT'");
        autorRepository.save(autor);

        Usuario usuario = new Usuario();
        usuario.setNombre("Anderson Henao");
        usuario.setEmail("ander.henao9@micorreo.com");
        usuarioRepository.save(usuario);

        Libro libro = new Libro();
        libro.setNombre("IT");
        libro.setAutor(autor);
        libro.setUsuario(usuario);
        libroRepository.save(libro);

        Prestamo prestamo = new Prestamo();
        prestamo.setLibro(libro);
        prestamo.setUsuario(usuario);
        prestamo.setFechaInicio(new Date());
        prestamo.setFechaEntrega(new Date(System.currentTimeMillis() + 604800000L));
        prestamo.setNumeroExtensiones(0);
        prestamoRepository.save(prestamo);

        // Registros de Venta de Medicamentos
        Paciente paciente = new Paciente();
        paciente.setNombre("Carlos Sanchez");
        paciente.setEdad(45);
        paciente.setHistoriaClinica("Historia Clinica Carlos");
        pacienteRepository.save(paciente);

        Medico medico = new Medico();
        medico.setNombre("Dr. Ana Herrera");
        medico.setEspecialidad("Cardiología");
        medicoRepository.save(medico);

        Medicamento medicamento = new Medicamento();
        medicamento.setNombre("Aspirina");
        medicamento.setDescripcion("Analgésico");
        medicamento.setPrecio(2000);
        medicamentoRepository.save(medicamento);

        Sucursal sucursal = new Sucursal();
        sucursal.setNombre("Sucursal Sur");
        sucursal.setDireccion("Calle 10 #21-31");
        sucursalRepository.save(sucursal);

        VentaMedicamento ventaMedicamento = new VentaMedicamento();
        ventaMedicamento.setPaciente(paciente);
        ventaMedicamento.setMedico(medico);
        ventaMedicamento.setMedicamento(medicamento);
        ventaMedicamento.setSucursal(sucursal);
        ventaMedicamento.setFechaVenta(new Date());
        ventaMedicamentoRepository.save(ventaMedicamento);

        // Registros de Gestión de Citas Médicas
        PacienteCita pacienteCita = new PacienteCita();
        pacienteCita.setNombre("Lina Martinez");
        pacienteCita.setEdad(30);
        pacienteCita.setHistoriaClinica("Historia Clinica Lina");
        pacienteCitaRepository.save(pacienteCita);

        MedicoCita medicoCita = new MedicoCita();
        medicoCita.setNombre("Dr. Pablo");
        medicoCita.setEspecialidad("Dermatología");
        medicoCitaRepository.save(medicoCita);

        Especialidad especialidad = new Especialidad();
        especialidad.setNombre("Dermatología");
        especialidadRepository.save(especialidad);

        Cita cita = new Cita();
        cita.setPaciente(pacienteCita);
        cita.setMedico(medicoCita);
        cita.setEspecialidad(especialidad);
        cita.setFechaHora(new Date());
        citaRepository.save(cita);

        // Métodos para listar Prestamos
        for (Prestamo p : prestamoRepository.findAll("SELECT p FROM Prestamo p", Prestamo.class)) {
            System.out.println("Préstamo: " + p.getId() + " - Libro: " + p.getLibro().getNombre() +
                    " - Usuario: " + p.getUsuario().getNombre() + " - Fecha de entrega: " + p.getFechaEntrega());
        }

        // Métodos para listar Ventas de Medicamentos
        for (VentaMedicamento vm : ventaMedicamentoRepository.findAll("SELECT vm FROM VentaMedicamento vm", VentaMedicamento.class)) {
            System.out.println("Venta: " + vm.getId() + " - Medicamento: " + vm.getMedicamento().getNombre() +
                    " - Paciente: " + vm.getPaciente().getNombre() + " - Fecha de venta: " + vm.getFechaVenta());
        }

        // Métodos para listar Citas Médicas
        for (Cita c : citaRepository.findAll("SELECT c FROM Cita c", Cita.class)) {
            System.out.println("Cita: " + c.getId() + " - Paciente: " + c.getPaciente().getNombre() +
                    " - Médico: " + c.getMedico().getNombre() + " - Fecha y hora: " + c.getFechaHora());
        }
    }
}