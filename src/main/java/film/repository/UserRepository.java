package film.repository;

import film.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;

public interface UserRepository extends JpaRepository<User, Long> {
//    @Query("SELECT u FROM User u JOIN UserRole ur ON u.Id = ur.User.Id JOIN Role r ON ur.Role.Id = r.Id WHERE r.RoleName = 'Admin'")
//    List<User> findAllAdminUsers();
//    @Query("SELECT u.ID FROM User u JOIN UserRole ur ON u.Id = ur.User.Id JOIN Role r ON ur.Role.Id = r.Id WHERE r.RoleName = 'Admin'")
//    int findAdminUserID();
    User findByUsername(String username);

}