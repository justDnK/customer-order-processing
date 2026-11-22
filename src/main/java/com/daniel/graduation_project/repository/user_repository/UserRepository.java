package com.daniel.graduation_project.repository.user_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.graduation_project.model.user_models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
