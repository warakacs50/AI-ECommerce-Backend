package com.kavinda.aicom.repository;

import com.kavinda.aicom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends
JpaRepository <User , Integer> {
}
