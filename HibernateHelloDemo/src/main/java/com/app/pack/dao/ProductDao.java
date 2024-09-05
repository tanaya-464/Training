package com.app.pack.dao;

import com.app.pack.config.ProductConfig;
import com.app.pack.model.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public void ProductSave(Product pr)
    {
        Transaction trn=null;
        try {
            Session sess= ProductConfig.getSessionFactory().openSession();
            trn= sess.beginTransaction();
            sess.save(pr);
            trn.commit();
        }
        catch(Exception e)
        {
            if(trn !=null)
            {
                trn.rollback();

            }
            e.printStackTrace();
        }
    }
    //Read of CRUD
    @SuppressWarnings("unchecked")
    public List<Product>getAllProducts() {
        List<Product> Products = new ArrayList<Product>();
        Session session = ProductConfig.getSessionFactory().openSession();
        try {
            Products = session.createQuery("from Product").getResultList();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return Products;
    }

    //Update of CRUD
    public void updateProduct(Product pr) {
        Transaction trns = null;
        Session session = ProductConfig.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(pr);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
//        } finally {
//            session.flush();
//            session.close();
//        }


        }
}



}
