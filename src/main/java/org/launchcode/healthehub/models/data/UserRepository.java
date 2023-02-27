package org.launchcode.healthehub.models.data;

import org.launchcode.healthehub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);
    User findByUsername(String username);
}
