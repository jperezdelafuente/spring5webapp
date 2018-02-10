package guru.springframework.spring5webapp.model;

import java.util.HashSet;
import java.util.Set;

public class Book {

    private String tittle;
    private String isbn;
    private String publisher;

    private Set<Author> authors = new HashSet<>();

    public Book() {
    }

    public Book(String tittle, String isbn, String publisher) {
        this.tittle = tittle;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Book(String tittle, String isbn, String publisher, Set<Author> authors) {
        this.tittle = tittle;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
