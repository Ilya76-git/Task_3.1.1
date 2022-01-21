package hiber_mvc.service;

import hiber_mvc.model.User;

import java.util.List;

public interface UserService {

    List<User> allUsers();

    void createUser(User user);

    User readUser(Long id);

    void deleteUser(User user);

    void updateUser(User user);

}
