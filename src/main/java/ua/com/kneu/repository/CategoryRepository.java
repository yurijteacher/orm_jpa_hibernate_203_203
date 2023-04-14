package ua.com.kneu.repository;

import org.hibernate.SessionFactory;
import ua.com.kneu.dao.CategoryDao;
import ua.com.kneu.entity.Category;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements CategoryDao {

    private SessionFactory session;
    public CategoryRepository(SessionFactory sessionFactory) {
        this.session = sessionFactory;
    }

    @Override
    public void save(Category obj) {

      EntityManager entityManager = session.createEntityManager();
      entityManager.getTransaction().begin();

      entityManager.persist(obj);
      //
      entityManager.getTransaction().commit();
      entityManager.close();

    }

    @Override
    public void update(Category obj) {

        EntityManager entityManager = session.createEntityManager();
        entityManager.getTransaction().begin();

        // d
//        entityManager.merge(obj);
//
//        // Native SQL
//        entityManager.createNativeQuery("update `category` set `_name` = ?, `description` = ?,`image` = ? where `id` = ?")
//                .setParameter(1,obj.getName())
//                .setParameter(2,obj.getDescription())
//                .setParameter(3,obj.getImage())
//                .setParameter(4,obj.getId())
//                .executeUpdate();

        // HQL
        entityManager.createQuery("update Category as c set c.name =:name, c.description = :descr,c.image = :image where c.id = :id")
                .setParameter("name",obj.getName())
                .setParameter("descr",obj.getDescription())
                .setParameter("image",obj.getImage())
                .setParameter("id",obj.getId())
                .executeUpdate();


        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void delete(Category obj) {

        EntityManager entityManager = session.createEntityManager();
        entityManager.getTransaction().begin();

        // D
//        entityManager.remove(obj);

        // HQL
//        entityManager.createQuery("delete from Category as c where c.id=:id")
//                .setParameter("id",obj.getId())
//                .executeUpdate();

        // Native SQL
        entityManager
                .createNativeQuery("delete from `category` as c where c.id = ?")
                .setParameter(1, obj.getId())
                .executeUpdate();

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void deleteAll() {

        EntityManager entityManager = session.createEntityManager();
        entityManager.getTransaction().begin();

        // HibernateQL
//        entityManager.createQuery("delete from Category").executeUpdate();
//
        // Native SQL
        entityManager.createNativeQuery("delete from `category`").executeUpdate();
//
        entityManager.getTransaction().commit();
        entityManager.close();


    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        EntityManager entityManager = session.createEntityManager();
        entityManager.getTransaction().begin();

        // HQL
//        categories =  entityManager.createQuery("from Category", Category.class).getResultList();

        // SQL Category.class!!!
        categories = entityManager.createNativeQuery("select * from `category`", Category.class).getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();


        return categories;
    }

    @Override
    public Category findById(Long id) {

        Category category = new Category();

        EntityManager entityManager = session.createEntityManager();
        entityManager.getTransaction().begin();

        // HQL
//        category = entityManager
//                .createQuery("from Category as c where c.id=:id", Category.class)
//                .setParameter("id", id)
//                .getSingleResult();

        // Native SQL
        category = (Category) entityManager.createNativeQuery("select * from `category` where `id`=?",Category.class).setParameter(1, id).getResultList().get(0);



        entityManager.getTransaction().commit();
        entityManager.close();

        return category;
    }

    @Override
    public Category findByName(String name) {

        Category category = new Category();

        EntityManager entityManager = session.createEntityManager();
        entityManager.getTransaction().begin();

        category = entityManager
                .createQuery("from Category as c where c.name=:name", Category.class)
                .setParameter("name", name)
                .getSingleResult();

        entityManager.getTransaction().commit();
        entityManager.close();

        return category;

    }
}
