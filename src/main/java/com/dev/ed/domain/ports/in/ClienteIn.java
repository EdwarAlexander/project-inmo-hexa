package com.dev.ed.domain.ports.in;

import com.dev.ed.domain.model.request.ClienteRequestModel;
import com.dev.ed.domain.model.response.ClienteResponseModel;
import com.dev.ed.domain.ports.crud.Crud;

public interface ClienteIn extends Crud<ClienteRequestModel, ClienteResponseModel, Long> {

}
