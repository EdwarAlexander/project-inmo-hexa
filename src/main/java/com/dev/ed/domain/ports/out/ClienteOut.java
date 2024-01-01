package com.dev.ed.domain.ports.out;

import com.dev.ed.domain.model.request.ClienteRequestModel;
import com.dev.ed.domain.model.response.ClienteResponseModel;
import com.dev.ed.domain.ports.crud.Crud;

public interface ClienteOut extends Crud<ClienteRequestModel, ClienteResponseModel, Long> {
}
