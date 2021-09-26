package repository;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateSessionFactoryUtil;


import java.util.List;

public class UserRepository {
    public void addUser(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void deleteUser(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public void updateUser(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public User findByIdUser(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void deleteByIdUser(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(findByIdUser(id));
        tx1.commit();
        session.close();
    }

    public List<User> findAll() {
        List<User> users = (List<User>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From User").list();
        return users;
    }

    public void deleteUsers(List <User> users) {
        for (User user : users) {
            deleteUser(user);
        }
    }
}
