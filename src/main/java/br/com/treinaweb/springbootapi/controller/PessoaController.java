package br.com.treinaweb.springbootapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.springbootapi.entity.Pessoa;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class PessoaController {
    

    @ApiOperation(value = "Retorna uma lista de pessoas")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Retorna a lista de pessoa"),
        @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
        @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @RequestMapping(value = "/pessoa", method = RequestMethod.GET, produces="application/json")
    public List<Pessoa> Get() {
//        return _pessoaRepository.findAll();
    	
    	Pessoa pessoa = new Pessoa();    	
    	
    	pessoa.setId(1L);
    	pessoa.setNome("Anderson");
    	
    	List<Pessoa> listPessoa = new ArrayList<Pessoa>();
    	listPessoa.add(pessoa);
    	return listPessoa;
    }

 
}