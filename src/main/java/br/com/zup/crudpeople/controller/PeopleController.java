package br.com.zup.crudpeople.controller;

import br.com.zup.crudpeople.dominio.People;
import br.com.zup.crudpeople.dtoRequest.PeopleRequest;
import br.com.zup.crudpeople.dtoResponse.PeopleResponse;
import br.com.zup.crudpeople.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepository;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PeopleResponse> cadastrarPeople(@RequestBody @Valid PeopleRequest peopleRequest){

        People people = peopleRepository.save(peopleRequest.toPeople(peopleRepository));
        return ResponseEntity.ok(new PeopleResponse(people));

    }

    @GetMapping
    public ResponseEntity<List<PeopleResponse>> listarPessoas(){

        List<People> people = peopleRepository.findAll();
        List<PeopleResponse>  listPeople = people.stream().map(e -> new PeopleResponse(e)).collect(Collectors.toList());
        return ResponseEntity.ok(listPeople);

    }
}
