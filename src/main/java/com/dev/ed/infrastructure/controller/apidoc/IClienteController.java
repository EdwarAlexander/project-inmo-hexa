package com.dev.ed.infrastructure.controller.apidoc;

import com.dev.ed.domain.model.request.ClienteRequestModel;
import com.dev.ed.domain.model.response.ClienteResponseModel;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public interface IClienteController {

    @PostMapping
    public ResponseEntity<ClienteResponseModel> create(@RequestBody @Valid ClienteRequestModel clienteRequestModel);
}
