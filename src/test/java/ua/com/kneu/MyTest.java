package ua.com.kneu;


import org.junit.Test;
import ua.com.kneu.config.Factory;
import ua.com.kneu.dao.CategoryDao;
import ua.com.kneu.entity.Category;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyTest {

private Factory factory = Factory.getInstance();


@Test
public void Test1(){

    int a = 3;
    int b = 5;

    int c = a + b; // 8

    assertEquals(8, c);

    CategoryDao categoryRepository = factory.getCategoryDao();

    Category category = new Category();
    category.setName("macbook air");
    category.setDescription("asd asd asd ");
    category.setImage("/image/mac.jpg");

    categoryRepository.save(category);

    List<Category> categories = categoryRepository.findAll();


    assertEquals(1, categories.size());


    Category category1 = categories.get(0);

    category1.setName("macbook pro");

    categoryRepository.update(category1);

    String name = categoryRepository.findById(1L).getName();

    assertEquals("macbook pro", name);

    categoryRepository.deleteAll();

    List<Category> categories1 = categoryRepository.findAll();

    assertEquals(0, categories1.size());
}



}
