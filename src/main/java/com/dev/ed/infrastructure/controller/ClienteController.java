package com.dev.ed.infrastructure.controller;

import com.dev.ed.application.service.ClienteService;
import com.dev.ed.domain.model.request.ClienteRequestModel;
import com.dev.ed.domain.model.response.ClienteResponseModel;
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
    public ResponseEntity<ClienteResponseModel> create(ClienteRequestModel clienteRequestModel) {
        ClienteResponseModel clienteResponseModel = clienteService.create(clienteRequestModel);
        return new ResponseEntity<>(clienteResponseModel, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ClienteResponseModel> update(Long clienteId, ClienteRequestModel clienteRequestModel) {
        return clienteService.update(clienteId, clienteRequestModel).map( cliente -> new ResponseEntity<>(cliente, HttpStatus.OK)).orElse( new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public ResponseEntity<ClienteResponseModel> get(Long clienteId) {
        return clienteService.get(clienteId).map(cliente-> new ResponseEntity<>(cliente,HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
