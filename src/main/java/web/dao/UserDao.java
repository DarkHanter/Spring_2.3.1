package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void edit(User user);
    void remove(long id);
    User getUser(long id);
    List<User> listUsers();
}
