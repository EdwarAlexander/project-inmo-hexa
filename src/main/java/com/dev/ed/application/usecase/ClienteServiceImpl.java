package com.dev.ed.application.usecase;

import com.dev.ed.domain.model.request.ClienteRequestModel;
import com.dev.ed.domain.model.response.ClienteResponseModel;
import com.dev.ed.domain.ports.in.ClienteIn;
import com.dev.ed.domain.ports.out.ClienteOut;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ClienteServiceImpl implements ClienteIn {

    private final ClienteOut clienteOut;

    @Override
    public ClienteResponseModel create(ClienteRequestModel request) {
        return clienteOut.create(request);
    }

    @Override
    public Optional<ClienteResponseModel> update(Long code, ClienteRequestModel request) {
        return clienteOut.update(code, request);
    }

    @Override
    public Optional<ClienteResponseModel> get(Long code) {
        return clienteOut.get(code);
    }

    @Override
    public List<ClienteResponseModel> getAll() {
        return clienteOut.getAll();
    }
}
