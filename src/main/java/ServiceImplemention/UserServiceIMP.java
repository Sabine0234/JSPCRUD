package ServiceImplemention;

import Model.UserJava;
import Repository.UserDao;
import Service.UserService;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserServiceIMP implements UserService {
    public UserServiceIMP(SessionFactory sessionFactory) {
    }
UserDao dao = new UserDao();
    @Override
    public UserJava addUser(UserJava user) {
        return dao.recordUser(user);
    }

    @Override
    public UserJava editUser(UserJava user) {
        return dao.editUser(user);
    }

    @Override
    public UserJava removeUser(UserJava user) {
        return dao.deleteUser(user);
    }

    @Override
    public UserJava findUser(UserJava user) {
        return dao.searchUser(user);
    }

    @Override
    public List<UserJava> allUser() {
        return dao.display();
    }
}
