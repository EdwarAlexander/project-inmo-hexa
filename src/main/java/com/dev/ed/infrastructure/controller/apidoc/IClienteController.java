package com.dev.ed.infrastructure.controller.apidoc;

import com.dev.ed.domain.model.request.ClienteRequestModel;
import com.dev.ed.domain.model.response.ClienteResponseModel;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public interface IClienteController {

    @PostMapping
    public ResponseEntity<ClienteResponseModel> create(@RequestBody @Valid ClienteRequestModel clienteRequestModel);

    @PutMapping("/{cliente_id}")
    public ResponseEntity<ClienteResponseModel> update(@PathVariable("cliente_id") Long clienteId, @RequestBody @Valid ClienteRequestModel clienteRequestModel);

    @GetMapping("/{cliente_id}")
    public ResponseEntity<ClienteResponseModel> get(@PathVariable("cliente_id") Long clienteId);

    @GetMapping
    public ResponseEntity<List<ClienteResponseModel>> getAll();
}
