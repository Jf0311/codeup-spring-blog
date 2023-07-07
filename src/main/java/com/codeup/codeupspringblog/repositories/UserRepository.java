package com.codeup.codeupspringblog.repositories;


import com.codeup.codeupspringblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Add any additional custom methods for user management if needed
}
