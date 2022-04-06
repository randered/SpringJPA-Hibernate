package com.vasilVas.Sdjpaintro.bootstrap;

import com.vasilVas.Sdjpaintro.domain.Book;
import com.vasilVas.Sdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Book bookDDD = new Book("Domain Driven Design", "123", "Me/Myself");
        System.out.println("Id: " + bookDDD.getId());

        Book savedDDD = bookRepository.save(bookDDD);

        System.out.println("Id: " + savedDDD.getId());

        Book bookSIA = new Book("Spring in Action", "123141", "OtherPerson");
        Book savedSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Id: " + book.getId());
            System.out.println("Id: " + book.getTitle());

        });
    }
}
