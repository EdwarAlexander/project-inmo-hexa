package com.dev.ed.domain.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteResponseModel {
    private Long id;
    private String nombres;
    private String apellidos;
    private String nroDocumento;
    private String celular;
    private String correo;
}
