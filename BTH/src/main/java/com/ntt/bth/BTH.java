/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ntt.bth;

import com.ntt.pojo.Category;
import com.ntt.repository.ProductRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class BTH {

    public static void main(String[] args) {
        ProductRepository r = new ProductRepository();
        r.getProducts(null).forEach(s -> System.out.printf("%d - %s - %d\n", s.getId(), s.getName(), s.getPrice()));
        
//        try(Session s = HibernateUtils.getFactory().openSession()) {
//            Query q = s.createQuery("FROM Category");
//            List<Category> cates = q.getResultList();
//            cates.forEach(a -> System.out.println(a.getName()));
//        }
    }
}
