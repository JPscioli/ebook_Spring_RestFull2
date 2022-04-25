package com.example.restfull_ebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/exemplo")
public class ExemploController {

    @Autowired
    private ExemploService exemploService;

    @GetMapping(value = "/{nome}")
    public String exemplo(@PathVariable("nome") String nome) {
        return "Olá " + nome;
    }

    @PostMapping
    public ResponseEntity<EmpresaDto> cadastrar(
            @RequestBody EmpresaDto empresaDto) {
        empresaDto.setId(1L);
        return ResponseEntity.ok(empresaDto);
    }
    @PostMapping
    public ResponseEntity<Response<EmpresaDto>> cadastrar(
            @Valid @RequestBody EmpresaDto empresaDto, BindingResult result) {
        Response<EmpresaDto> response = new Response<EmpresaDto>();
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error ->
                    response.getErrors().add(error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(response);
        }
        empresaDto.setId(1L);
        response.setData(empresaDto);
        return ResponseEntity.ok(response);
    }

}
