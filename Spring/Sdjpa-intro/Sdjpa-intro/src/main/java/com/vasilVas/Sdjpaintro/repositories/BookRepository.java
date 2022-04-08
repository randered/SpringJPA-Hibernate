package com.vasilVas.Sdjpaintro.repositories;

import com.vasilVas.Sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
