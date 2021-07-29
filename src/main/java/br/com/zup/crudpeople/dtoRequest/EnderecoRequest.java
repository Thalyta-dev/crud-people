package br.com.zup.crudpeople.dtoRequest;

import br.com.zup.crudpeople.dominio.Endereco;

import javax.validation.constraints.NotBlank;

public class EnderecoRequest {

    @NotBlank
    private String id;

    @NotBlank
    private String rua;

    @NotBlank
    private String numero;

    @NotBlank
    private String bairro;

    @NotBlank
    private String cidade;

    @NotBlank
    private String estado;

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public Endereco toEndereco(){
        return new Endereco(id, rua,numero,bairro,cidade,estado);
    }
}
