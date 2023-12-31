package br.com.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.udemy.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
