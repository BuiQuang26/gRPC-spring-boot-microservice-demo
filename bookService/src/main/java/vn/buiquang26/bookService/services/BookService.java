package vn.buiquang26.bookService.services;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import vn.buiquang26.bookService.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Service
public class BookService {

    private final Logger log = LoggerFactory.getLogger(BookService.class);

    private final List<Book> bookDataInit = new ArrayList<>();

    @PostConstruct
    private void init() {
        Random random = new Random();
        IntStream.range(0, 10).forEach(i -> {
            Book book = new Book();
            book.setId((long) i);
            book.setName("Book " + i);
            book.setDescription("Description " + i);
            book.setUser("User " + random.nextInt(100));
            bookDataInit.add(book);
        });
    }

    public Book getBookById(long id) {
        log.info("getBookById: {}", id);
        return bookDataInit.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Book> getBooks() {
        log.info("getBooks");
        return bookDataInit;
    }

}
