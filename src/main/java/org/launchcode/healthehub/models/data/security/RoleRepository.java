package org.launchcode.healthehub.models.data.security;

// created by kp on 2/27/2023

import jdk.jfr.Registered;
import org.launchcode.healthehub.security.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface RoleRepository extends JpaRepository<Role, CriteriaBuilder.In> {
    Role findByRole(String role);
}
