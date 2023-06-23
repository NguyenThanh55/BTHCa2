/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.repository;

import com.ntt.bth.HibernateUtils;
import com.ntt.pojo.Category;
import com.ntt.pojo.Product;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class ProductRepository {
    public List<Product> getProducts(Map<String, String> params) {
        try(Session s = HibernateUtils.getFactory().openSession()) {
            CriteriaBuilder b = s.getCriteriaBuilder();
            CriteriaQuery<Product> q = b.createQuery(Product.class);
            Root root = q.from(Product.class);
            q.select(root);
            
            if (params != null)
            {
                String kw = 
            }
            
            Query p = s.createQuery(q);
            return p.getResultList();
        }
    }
}
