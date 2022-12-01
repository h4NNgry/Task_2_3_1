package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> listUsers();

    //--
    void updateUser(User user, int id);

    void removeUser(int id);

    User getUserById(int id);
}
