package com.devops.ecscicd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devops.ecscicd.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
