package com.dev.ed.application.usecase;

import com.dev.ed.domain.model.ClienteModel;
import com.dev.ed.domain.ports.in.ClienteIn;
import com.dev.ed.domain.ports.out.ClienteOut;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class ClienteServiceImpl implements ClienteIn {

    private final ClienteOut clienteOut;

    @Override
    public ClienteModel create(ClienteModel request) {
        return clienteOut.create(request);
    }

    @Override
    public Optional<ClienteModel> update(Long code, ClienteModel request) {
        return clienteOut.update(code, request);
    }

    @Override
    public Optional<ClienteModel> get(Long code) {
        return clienteOut.get(code);
    }
}
