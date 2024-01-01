package com.dev.ed.infrastructure.repository.adapter;

import com.dev.ed.domain.model.request.ClienteRequestModel;
import com.dev.ed.domain.model.response.ClienteResponseModel;
import com.dev.ed.domain.ports.out.ClienteOut;
import com.dev.ed.infrastructure.entity.ClienteEntity;
import com.dev.ed.infrastructure.repository.ClienteRepository;
import com.dev.ed.util.mapper.ClienteMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ClienteRepositoryAdapter implements ClienteOut {

    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponseModel create(ClienteRequestModel request) {
        ClienteEntity clienteEntity = ClienteMapper.MAPPER.mapToClienteEntity(request);
        return ClienteMapper.MAPPER.mapToClienteResponseModel(clienteRepository.save(clienteEntity));
    }

    @Override
    public Optional<ClienteResponseModel> update(Long code, ClienteRequestModel request) {
        return Optional.empty();
    }

    @Override
    public Optional<ClienteResponseModel> get(Long code) {
        return Optional.empty();
    }
}
