package guru.springframework.jdbc.repositories;

import guru.springframework.jdbc.repositories.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
