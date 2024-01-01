package com.dev.ed.domain.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequestModel {

    @NotEmpty(message = "Debe ingresar el nombre del cliente")
    private String nombres;

    @NotEmpty(message = "Debe ingresar el apellido del cliente")
    private String apellidos;

    @NotEmpty(message = "Debe ingresar el nro de documento del cliente")
    private String nroDocumento;

    @NotEmpty(message = "Debe ingresar el nro de celular del cliente")
    @Pattern(regexp = "\\d+", message = "Debe ser un número")
    private String celular;

    @NotEmpty(message = "Debe ingresar el correo del cliente")
    @Email
    private String correo;
}
