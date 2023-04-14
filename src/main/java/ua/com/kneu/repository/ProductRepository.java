package ua.com.kneu.repository;

import org.hibernate.SessionFactory;
import ua.com.kneu.dao.GeneralDao;
import ua.com.kneu.dao.ProductDao;
import ua.com.kneu.entity.Product;

import java.util.List;

public class ProductRepository implements ProductDao {


    private SessionFactory session;
    public ProductRepository(SessionFactory sessionFactory) {
    this.session = sessionFactory;
    }

    @Override
    public void save(Product obj) {

    }

    @Override
    public void update(Product obj) {

    }

    @Override
    public void delete(Product obj) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public Product findByName(String name) {
        return null;
    }
}
