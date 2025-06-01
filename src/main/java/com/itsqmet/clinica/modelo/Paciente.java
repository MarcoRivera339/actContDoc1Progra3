package com.itsqmet.clinica.modelo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {

    @Size(min=10, max=10)
    private String cedula;

    @Size(min=3, max=10)
    private String nombre;

    @Size(min=3, max=10)
    private String apellido;

    @Min(value = 18)
    @Max(value = 75)
    private Long edad;

    @Size(min=3, max=10)
    private String estadoCivil;

    @Size(min=2, max=4)
    private String tipoSangre;

    @Min(value = 130)
    @Max(value = 200)
    private Long talla;

    @Min(value = 10)
    @Max(value = 100)
    private Long peso;

    @Size(min=3, max=10)
    private String presion;

    @Min(value = 10)
    @Max(value = 100)
    private Long saturacion;
}
