package ua.com.kneu.repository;

import ua.com.kneu.dao.BookDao;
import ua.com.kneu.model.Book;

import java.util.List;

public class BookRepository implements BookDao {
    @Override
    public void save(Book obj) {

    }

    @Override
    public void update(Book obj) {

    }

    @Override
    public void delete(Book obj) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book findById(Long id) {
        return null;
    }

    @Override
    public Book findByName(String name) {
        return null;
    }
}
