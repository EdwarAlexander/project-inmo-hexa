package com.dev.ed.domain.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequestModel {
    private String nombres;
    private String apellidos;
    private String nroDocumento;
    private String celular;
    private String correo;
}
