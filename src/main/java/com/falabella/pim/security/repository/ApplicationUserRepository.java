package com.falabella.pim.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.falabella.pim.security.dao.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
