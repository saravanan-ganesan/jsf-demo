package com.jsf.samples.bootfaces.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsf.samples.bootfaces.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
