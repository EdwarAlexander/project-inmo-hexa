package com.dev.ed.infrastructure.entity;

import com.dev.ed.domain.model.ClienteModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String nroDocumento;
    private String celular;
    private String correo;

    /*public ClienteEntity() {
    }

    public ClienteEntity(Long id, String nombres, String apellidos, String nroDocumento, String celular, String correo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nroDocumento = nroDocumento;
        this.celular = celular;
        this.correo = correo;
    }

    public static ClienteEntity fromClienteModel(ClienteModel clienteModel){
        return new ClienteEntity(clienteModel.getId(), clienteModel.getNombres(), clienteModel.getApellidos(), clienteModel.getNroDocumento(), clienteModel.getCelular(), clienteModel.getCorreo());
    }

    public ClienteModel fromClienteEntity(){
        return new ClienteModel(id, nombres, apellidos, nroDocumento, celular, correo);
    }*/
}
