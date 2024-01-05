package com.dev.ed.application.service;

import com.dev.ed.domain.model.request.ClienteRequestModel;
import com.dev.ed.domain.model.response.ClienteResponseModel;
import com.dev.ed.domain.ports.in.ClienteIn;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ClienteService implements ClienteIn {

    private final ClienteIn clienteIn;


    @Override
    public ClienteResponseModel create(ClienteRequestModel request) {
        return clienteIn.create(request);
    }

    @Override
    public Optional<ClienteResponseModel> update(Long code, ClienteRequestModel request) {
        return clienteIn.update(code, request);
    }

    @Override
    public Optional<ClienteResponseModel> get(Long code) {
        return clienteIn.get(code);
    }

    @Override
    public List<ClienteResponseModel> getAll() {
        return clienteIn.getAll();
    }
}
