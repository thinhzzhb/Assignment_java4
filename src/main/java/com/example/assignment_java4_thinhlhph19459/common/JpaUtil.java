package com.example.assignment_java4_thinhlhph19459.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
        private static EntityManagerFactory factory;

        static public EntityManager getConnection(){
            if(factory == null || !factory.isOpen()){
                factory = Persistence.createEntityManagerFactory("assJava4");
            }
            return factory.createEntityManager();
        }
        static public void close(){
            if(factory !=null || factory.isOpen()){
                factory.close();
            }
        }
}
