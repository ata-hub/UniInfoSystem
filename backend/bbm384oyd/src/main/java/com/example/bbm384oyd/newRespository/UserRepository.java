package com.example.bbm384oyd.newRespository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bbm384oyd.newModels.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByEmail(String email);
}
