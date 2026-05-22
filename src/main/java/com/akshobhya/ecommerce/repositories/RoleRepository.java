package com.akshobhya.ecommerce.repositories;

import com.akshobhya.ecommerce.model.AppRole;
import com.akshobhya.ecommerce.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
