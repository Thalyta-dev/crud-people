package br.com.zup.crudpeople.dtoResponse;

import br.com.zup.crudpeople.dominio.Endereco;
import br.com.zup.crudpeople.dominio.People;

public class PeopleResponse {


    private String id;

    private String nome;

    public PeopleResponse() {
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public PeopleResponse(People people) {
        this.id = people.getId();
        this.nome = people.getNome();
//        this.endereco = people.getEndereco();
    }
}
