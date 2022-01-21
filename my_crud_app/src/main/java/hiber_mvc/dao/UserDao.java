package hiber_mvc.dao;

import hiber_mvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserDao  {
    List<User> allUsers();

    void createUser(User user);

    User readUser(Long id);

    void deleteUser(User user);

    void updateUser(User user);
}
