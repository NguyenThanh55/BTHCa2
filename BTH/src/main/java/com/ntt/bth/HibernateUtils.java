/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.bth;


import com.ntt.pojo.Category;
import com.ntt.pojo.Product;
import com.ntt.pojo.Tag;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author admin
 */
public class HibernateUtils {
    private static final SessionFactory factory;
    static {
        Configuration conf = new Configuration();
        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost/saledb");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "Admin@123");
        properties.put(Environment.SHOW_SQL, "true");
        
        conf.setProperties(properties);
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(Tag.class);
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        factory = conf.buildSessionFactory(serviceRegistry);
    }

    /**
     * @return the factory
     */
    public static SessionFactory getFactory() {
        return factory;
    }
    
}
