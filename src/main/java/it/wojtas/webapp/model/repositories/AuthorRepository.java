package it.wojtas.webapp.model.repositories;

import it.wojtas.webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
