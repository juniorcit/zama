package org.zama.examples.multitenant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zama.examples.multitenant.model.User;

import java.util.Optional;

/**
 * RoleRepository.
 * @author Zakir Magdum
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByName(String name);
}
