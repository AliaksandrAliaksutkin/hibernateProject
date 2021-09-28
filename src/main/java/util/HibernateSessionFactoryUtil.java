package util;

import lombok.extern.java.Log;
import model.Address;
import model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/*класса HibernateSessionFactoryUtil. У него всего одна задача — создавать для нашего приложения фабрику сессий для
работы с БД (привет, паттерн "Фабрика!").Больше он ничего не умее*/

@Log
public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(Address.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                log.info("Исключение!" + e);
            }
        }
        return sessionFactory;
    }
}