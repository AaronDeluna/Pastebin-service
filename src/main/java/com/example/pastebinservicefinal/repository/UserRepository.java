package com.example.pastebinservicefinal.repository;

import com.example.pastebinservicefinal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
