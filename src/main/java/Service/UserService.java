package Service;

import Model.UserJava;

import java.util.List;

public interface UserService {
    UserJava addUser(UserJava user);
    UserJava editUser(UserJava user);
    UserJava removeUser(UserJava user);
    UserJava findUser(UserJava user);
    List<UserJava> allUser();
}
