package guru.springframework.jdbc.repositories;


import guru.springframework.jdbc.repositories.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
