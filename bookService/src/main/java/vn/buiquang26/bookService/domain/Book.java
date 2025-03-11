package vn.buiquang26.bookService.domain;


import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private String description;
    private String user;
}
