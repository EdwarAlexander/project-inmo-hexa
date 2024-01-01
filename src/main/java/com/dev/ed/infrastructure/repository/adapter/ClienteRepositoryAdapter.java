package com.dev.ed.infrastructure.repository.adapter;

import com.dev.ed.domain.model.ClienteModel;
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

    //private ClienteMapper clienteMapper;

    @Override
    public ClienteModel create(ClienteModel request) {
        ClienteEntity clienteEntity = ClienteMapper.MAPPER.mapToClienteEntity(request);
        return ClienteMapper.MAPPER.mapToClienteModel(clienteRepository.save(clienteEntity));
    }

    @Override
    public Optional<ClienteModel> update(Long code, ClienteModel request) {
        return Optional.empty();
    }

    @Override
    public Optional<ClienteModel> get(Long code) {
        return Optional.empty();
    }
}
