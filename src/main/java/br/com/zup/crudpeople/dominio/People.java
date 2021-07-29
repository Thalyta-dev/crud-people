package br.com.zup.crudpeople.dominio;


import br.com.zup.crudpeople.dtoRequest.EnderecoRequest;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document
public class People {

    @Id
    private String id;

    @NotBlank
    private String nome;

    @NotBlank
    @CPF
    private String cpf;

//    @NotBlank
//    @DBRef
//    private Endereco endereco;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

//    public Endereco getEndereco() {
//        return endereco;
//    }


    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public People(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
//        this.endereco = endereco;
    }
}
