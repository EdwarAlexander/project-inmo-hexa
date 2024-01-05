package com.dev.ed.infrastructure.util.mapper;

import com.dev.ed.domain.model.request.ClienteRequestModel;
import com.dev.ed.domain.model.response.ClienteResponseModel;
import com.dev.ed.infrastructure.entity.ClienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClienteMapper {

    ClienteMapper MAPPER = Mappers.getMapper(ClienteMapper.class);

    ClienteEntity mapToClienteEntity(ClienteRequestModel clienteRequestModel);

    ClienteResponseModel mapToClienteResponseModel(ClienteEntity clienteEntity);

    List<ClienteResponseModel> mapToListClienteResponseModel(List<ClienteEntity> clienteEntityList);
}
