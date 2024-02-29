package Repository;

import Conroller.HibernateUtil;
import Model.UserJava;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {
    public UserJava recordUser(UserJava userObject) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.save(userObject);
            session.beginTransaction().commit();
            session.close();
            return userObject;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public UserJava editUser(UserJava userObject) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.update(userObject);
            session.beginTransaction().commit();
            session.close();
            return userObject;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public UserJava deleteUser(UserJava userObject) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.delete(userObject);
            session.beginTransaction().commit();
            session.close();
            return userObject;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public UserJava searchUser(UserJava userObject) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            UserJava sign = session.get(UserJava.class, userObject.getUser_id());
            session.close();
            return sign;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<UserJava> display() {

        try {
            Session session=HibernateUtil.getSessionFactory().openSession();
            List<UserJava> user_data = session.createQuery("select user from UserJava user ").list();
            session.beginTransaction().commit();
            session.close();
            return user_data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

