package com.app.pack;

import com.app.pack.config.ProductConfig;
import com.app.pack.dao.ProductDao;
import com.app.pack.model.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductMain {
    public static void main(String[] args) {


        ProductDao prdao = new ProductDao();
//        Product pr = new Product(34.45, "Pen");
        Product pr = new Product();
//
//        prdao.ProductSave(pr);

        // Get all Customers - Read of CRUD
        for (Product rc1 : prdao.getAllProducts()) {
            System.out.println(rc1.getPrid());
            System.out.println(rc1.getPrice());
            System.out.println(rc1.getPrname());
        }

        // Update Customer - Update of CRUD
//        pr.setPrid(4);
//        pr.setPrice(56.7);
//        pr.setPrname("Chips");
//        prdao.updateProduct(pr);
        //  List<Product> prods=prdao.getProducts();
        //prods.forEach(p->System.out.println(p));

    }
}

