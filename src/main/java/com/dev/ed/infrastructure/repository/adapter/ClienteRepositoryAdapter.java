package com.dev.ed.infrastructure.repository.adapter;

import com.dev.ed.domain.model.request.ClienteRequestModel;
import com.dev.ed.domain.model.response.ClienteResponseModel;
import com.dev.ed.domain.ports.out.ClienteOut;
import com.dev.ed.infrastructure.entity.ClienteEntity;
import com.dev.ed.infrastructure.repository.ClienteRepository;
import com.dev.ed.infrastructure.util.constants.TablesName;
import com.dev.ed.infrastructure.util.exception.IdNotFoundException;
import com.dev.ed.infrastructure.util.mapper.ClienteMapper;
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
        if(!clienteRepository.existsById(code)){
            throw new IdNotFoundException(TablesName.cliente.name());
        }
        ClienteEntity clienteEntity = ClienteMapper.MAPPER.mapToClienteEntity(request);
        clienteEntity.setId(code);
        ClienteResponseModel clienteResponseModel = ClienteMapper.MAPPER.mapToClienteResponseModel(clienteRepository.save(clienteEntity));
        return Optional.of(clienteResponseModel);
    }

    @Override
    public Optional<ClienteResponseModel> get(Long code) {
        return clienteRepository.findById(code).map(cliente->ClienteMapper.MAPPER.mapToClienteResponseModel(cliente));
    }
}
