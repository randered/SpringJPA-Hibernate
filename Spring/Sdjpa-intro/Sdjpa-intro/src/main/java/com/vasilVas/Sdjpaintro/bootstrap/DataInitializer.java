package com.vasilVas.Sdjpaintro.bootstrap;

import com.vasilVas.Sdjpaintro.domain.Book;
import com.vasilVas.Sdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();

        Book bookDDD = new Book("Domain Driven Design", "123", "Me/Myself");
        Book savedDDD = bookRepository.save(bookDDD);

        Book bookSIA = new Book("Spring in Action", "123141", "OtherPerson");
        Book savedSIA = bookRepository.save(bookSIA);

        Book book3 = new Book("Learning", "998877", "BMW...");
        Book savedBook3 = bookRepository.save(book3);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Id: " + book.getId());
            System.out.println("Id: " + book.getTitle());

        });
    }
}
