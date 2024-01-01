package com.dev.ed.util.mapper;

import com.dev.ed.domain.model.ClienteModel;
import com.dev.ed.infrastructure.entity.ClienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteMapper {

    ClienteMapper MAPPER = Mappers.getMapper(ClienteMapper.class);

    ClienteEntity mapToClienteEntity(ClienteModel clienteModel);

    ClienteModel mapToClienteModel(ClienteEntity clienteEntity);
}
