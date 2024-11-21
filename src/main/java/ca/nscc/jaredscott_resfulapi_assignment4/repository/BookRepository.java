package ca.nscc.jaredscott_resfulapi_assignment4.repository;

import ca.nscc.jaredscott_resfulapi_assignment4.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByName(String name);
}
