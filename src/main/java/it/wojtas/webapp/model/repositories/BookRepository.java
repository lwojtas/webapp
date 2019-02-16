package it.wojtas.webapp.model.repositories;

import it.wojtas.webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
