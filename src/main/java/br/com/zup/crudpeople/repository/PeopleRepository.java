package br.com.zup.crudpeople.repository;

import br.com.zup.crudpeople.dominio.Endereco;
import br.com.zup.crudpeople.dominio.People;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends MongoRepository<People, String> {
}
