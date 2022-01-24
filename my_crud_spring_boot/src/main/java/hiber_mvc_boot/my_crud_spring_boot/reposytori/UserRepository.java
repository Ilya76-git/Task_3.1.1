package hiber_mvc_boot.my_crud_spring_boot.reposytori;

import hiber_mvc_boot.my_crud_spring_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
