package com.junior.pecho.user.dao.repository;

import com.junior.pecho.user.model.jpa.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface UserRepository extends ReactiveCrudRepository<User, UUID> {

}
