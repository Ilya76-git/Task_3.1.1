package hiber_mvc_boot.my_crud_spring_boot.service;

import hiber_mvc_boot.my_crud_spring_boot.entity.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void createUser(User user);

    User readUser(Long id);

    void deleteUser(User user);

    void updateUser(User user);
}
