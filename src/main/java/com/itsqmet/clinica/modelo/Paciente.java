package com.itsqmet.clinica.modelo;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {

    @NotBlank(message = "La cédula no puede estar vacía")
    @Size(min = 10, max = 10, message = "La cédula debe tener exactamente 10 caracteres")
    @Pattern(regexp = "\\d{10}", message = "La cédula debe contener solo números")
    private String cedula;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(min = 3, max = 20, message = "El nombre debe tener entre 3 y 20 caracteres")
    @Pattern(regexp = "^[A-Za-záéíóúÁÉÍÓÚñÑ\\s]+$", message = "El nombre solo puede contener letras y espacios")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacío")
    @Size(min = 3, max = 20, message = "El apellido debe tener entre 3 y 20 caracteres")
    @Pattern(regexp = "^[A-Za-záéíóúÁÉÍÓÚñÑ\\s]+$", message = "El apellido solo puede contener letras y espacios")
    private String apellido;

    @NotNull(message = "La edad es obligatoria")
    @Min(value = 0, message = "La edad no puede ser negativa")
    @Max(value = 120, message = "La edad no puede superar los 120 años")
    private Long edad;

    @NotBlank(message = "El estado civil no puede estar vacío")
    @Size(min = 3, max = 15, message = "El estado civil debe tener entre 3 y 15 caracteres")
    private String estadoCivil;

    @NotBlank(message = "El tipo de sangre es obligatorio")
    @Pattern(
            regexp = "^(A|B|AB|O)[+-]$",
            message = "El tipo de sangre debe ser A+, A-, B+, B-, AB+, AB-, O+ o O-"
    )
    private String tipoSangre;

    @NotNull(message = "La talla es obligatoria")
    @Min(value = 130, message = "La talla mínima es 130 cm")
    @Max(value = 220, message = "La talla máxima es 220 cm")
    private Long talla;

    @NotNull(message = "El peso es obligatorio")
    @Min(value = 30, message = "El peso mínimo es 30 kg")
    @Max(value = 200, message = "El peso máximo es 200 kg")
    private Long peso;

    @NotBlank(message = "La presión arterial es obligatoria")
    @Pattern(
            regexp = "^\\d{2,3}/\\d{2,3}$",
            message = "La presión debe tener el formato sistólica/diastólica (ej. 120/80)"
    )
    private String presion;

    @NotNull(message = "La saturación es obligatoria")
    @Min(value = 50, message = "La saturación mínima es 50%")
    @Max(value = 100, message = "La saturación máxima es 100%")
    private Long saturacion;
}

