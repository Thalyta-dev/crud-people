package br.com.zup.crudpeople.dtoRequest;

import br.com.zup.crudpeople.dominio.People;
import br.com.zup.crudpeople.repository.PeopleRepository;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;

public class PeopleRequest {

    @NotBlank
    @JsonProperty
    private String nome;

    @NotBlank
    @CPF
    @JsonProperty
    private String cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public PeopleRequest(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public People toPeople(PeopleRepository peopleRepository){
        return new People(nome,cpf);//,endereco.toEndereco());
    }
}
