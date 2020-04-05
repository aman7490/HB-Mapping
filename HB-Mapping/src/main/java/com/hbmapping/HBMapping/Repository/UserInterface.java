package com.hbmapping.HBMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hbmapping.HBMapping.Entity.User;

public interface UserInterface extends JpaRepository<User, Integer> {

}
