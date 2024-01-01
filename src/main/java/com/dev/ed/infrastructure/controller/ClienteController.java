package com.dev.ed.infrastructure.controller;

import com.dev.ed.application.service.ClienteService;
import com.dev.ed.domain.model.ClienteModel;
import com.dev.ed.infrastructure.controller.apidoc.IClienteController;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ClienteController implements IClienteController {

    private final ClienteService clienteService;

    @Override
    public ResponseEntity<ClienteModel> create(ClienteModel clienteModelRequest) {
        ClienteModel clienteModel = clienteService.create(clienteModelRequest);
        return new ResponseEntity<>(clienteModel, HttpStatus.CREATED);
    }
}