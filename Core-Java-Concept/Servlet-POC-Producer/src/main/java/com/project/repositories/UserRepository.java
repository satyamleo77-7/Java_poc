package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.UserData;

@Repository
public interface UserRepository extends JpaRepository<UserData,Integer> {

}
