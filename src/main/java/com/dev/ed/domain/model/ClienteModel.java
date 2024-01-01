package com.dev.ed.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteModel {

    private Long id;
    private String nombres;
    private String apellidos;
    private String nroDocumento;
    private String celular;
    private String correo;

}
