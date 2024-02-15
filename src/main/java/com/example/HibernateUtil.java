package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory(){
		if(sessionFactory == null){
			try {
				//Crea un registro
				registry = new StandardServiceRegistryBuilder().configure().build();
				//Crea MetadataSources
				MetadataSources sources = new MetadataSources(registry);
				//Crea Metadata
				Metadata metadata = sources.getMetadataBuilder().build();
				//Crea SessionFactory
				sessionFactory = metadata.getSessionFactoryBuilder().build();
			}catch (Exception e){
				e.printStackTrace(System.out);
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}
		return sessionFactory;
	}

	public static void shutdown(){
		if(registry != null){
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

}
