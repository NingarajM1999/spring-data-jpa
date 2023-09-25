package com.example.demoSpringDataJpa.repo;
import com.example.demoSpringDataJpa.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class ProductRepoTest {

    @Autowired
    private ProductRepo productRepo;

    @Test
    void saveMethod(){
        //create product
        Product product = new Product();
        product.setName("product 1");
        product.setDescription("product one description");
        product.setSku("100ABC");
        product.setPrice(new BigDecimal(100));
        product.setActive(true);
        product.setImageUrl("product1.png");

        //save product
        Product savedObject = productRepo.save(product);

        //display product
        System.out.println(savedObject.getId());
        System.out.println(savedObject.toString());

    }

    //update
    @Test
    void updateUsingSaveMethod(){
        //find or retrive an entity by id
        Long id=1L;
        Product product = productRepo.findById(id).get();
        //update entity information
        product.setName("updated product 1");
        product.setDescription("updated product 1 desc");
        //save the product
        productRepo.save(product);
    }
    //find by id
    @Test
    void findById(){
        Long id=1L;
        Product product = productRepo.findById(id).get();

    }

    //saveAll method
//    @Test
//    void saveAllMethod(){
//        Product product = new Product();
//        product.setName("product 2");
//        product.setDescription("product two description");
//        product.setSku("101ABC");
//        product.setPrice(new BigDecimal(102));
//        product.setActive(true);
//        product.setImageUrl("product2.png");
//
//        Product product3 = new Product();
//        product.setName("product 3");
//        product.setDescription("product three description");
//        product.setSku("103ABC");
//        product.setPrice(new BigDecimal(103));
//        product.setActive(true);
//        product.setImageUrl("product3.png");
//
//        productRepo.saveAll(List.of(product,product3));
//
//
//    }

    @Test
    void findAllById(){
        List<Product> all = productRepo.findAll();
        all.forEach(product -> System.out.println(product.getName()));
    }

    @Test
    void deleteById(){
        Long id=1L;
        productRepo.deleteById(id);
    }

    @Test
    void countMethod(){
        long count = productRepo.count();
        System.out.println(count);
    }
    @Test
    void existById(){
        Long id=1L;
        boolean b = productRepo.existsById(id);
        System.out.println(b);
    }
}