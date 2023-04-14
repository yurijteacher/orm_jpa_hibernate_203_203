package ua.com.kneu.config;

import org.hibernate.SessionFactory;
import ua.com.kneu.dao.CategoryDao;
import ua.com.kneu.dao.ClientDao;
import ua.com.kneu.dao.ProductDao;
import ua.com.kneu.repository.CategoryRepository;
import ua.com.kneu.repository.ClientRepository;
import ua.com.kneu.repository.ProductRepository;

import javax.persistence.Persistence;

public class Factory {
    public static Factory INSTANCE;

    public static Factory getInstance(){

        if (INSTANCE==null) {
            INSTANCE = new Factory();
        }

        return INSTANCE;
    }

    private final SessionFactory session;

    public Factory() {this.session = (SessionFactory) Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");}

    public ProductDao getProductDao(){
        return new ProductRepository(session);
    }

    public CategoryDao getCategoryDao(){
        return new CategoryRepository(session);
    }

    public ClientDao getClientDao(){
        return new ClientRepository(session);
    }

}
