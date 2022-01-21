package hiber_mvc.service;

import hiber_mvc.dao.UserDao;
import hiber_mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Transactional
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Transactional
    public User readUser(Long id) {
        return userDao.readUser(id);
    }

    @Transactional
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
