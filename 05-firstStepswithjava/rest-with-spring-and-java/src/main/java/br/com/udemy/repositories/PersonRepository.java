package br.com.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.udemy.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
