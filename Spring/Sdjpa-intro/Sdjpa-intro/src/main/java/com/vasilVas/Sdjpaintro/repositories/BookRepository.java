package com.vasilVas.Sdjpaintro.repositories;

import com.vasilVas.Sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
