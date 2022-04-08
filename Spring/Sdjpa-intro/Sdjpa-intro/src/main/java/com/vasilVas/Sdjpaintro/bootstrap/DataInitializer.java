package com.vasilVas.Sdjpaintro.bootstrap;

import com.vasilVas.Sdjpaintro.domain.Author;
import com.vasilVas.Sdjpaintro.domain.Book;
import com.vasilVas.Sdjpaintro.repositories.AuthorRepository;
import com.vasilVas.Sdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public DataInitializer(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();

        Author author1 = new Author("Vasil", "Vasilev");
        Author savedAuthor1 = authorRepository.save(author1);

        Book bookDDD = new Book("Domain Driven Design", "123", "Me/Myself", author1.getId());
        Book savedDDD = bookRepository.save(bookDDD);

        Book bookSIA = new Book("Spring in Action", "123141", "OtherPerson", author1.getId());
        Book savedSIA = bookRepository.save(bookSIA);

        Book book3 = new Book("Learning", "998877", "BMW...",author1.getId());
        Book savedBook3 = bookRepository.save(book3);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Id: " + book.getId());
            System.out.println("Id: " + book.getTitle());

        });
    }
}
