package ua.com.kneu.repository;

import org.hibernate.SessionFactory;
import ua.com.kneu.dao.ClientDao;
import ua.com.kneu.entity.Client;

import java.util.List;

public class ClientRepository implements ClientDao {

    private SessionFactory session;

    public ClientRepository(SessionFactory session) {
        this.session = session;
    }

    @Override
    public void save(Client obj) {

    }

    @Override
    public void update(Client obj) {

    }

    @Override
    public void delete(Client obj) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public Client findByName(String name) {
        return null;
    }
}
