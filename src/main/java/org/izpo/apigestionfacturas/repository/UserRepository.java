package org.izpo.apigestionfacturas.repository;

import org.izpo.apigestionfacturas.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.email=:email")
    Optional<User> findByEmail(@Param("email") String email);

    @Query("SELECT COUNT(u)>0 FROM User u WHERE u.email=:email ")
    boolean existByEmail(@Param("email") String email);

    @Query("SELECT u FROM User u WHERE u.email=:email")
    Optional<User> findByUsername(@Param("email")String username);
}
