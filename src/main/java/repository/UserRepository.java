package repository;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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

    public List<User> findByHouse(Integer house) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM model.User u WHERE u.address.house = " + house);

        List<User> listUser = (List<User>) query.list();
        return listUser;
    }

}
