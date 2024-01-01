package com.dev.ed.application.service;

import com.dev.ed.domain.model.ClienteModel;
import com.dev.ed.domain.ports.in.ClienteIn;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class ClienteService implements ClienteIn {

    private final ClienteIn clienteIn;

    @Override
    public ClienteModel create(ClienteModel request) {
        return clienteIn.create(request);
    }

    @Override
    public Optional<ClienteModel> update(Long code, ClienteModel request) {
        return clienteIn.update(code, request);
    }

    @Override
    public Optional<ClienteModel> get(Long code) {
        return clienteIn.get(code);
    }
}
