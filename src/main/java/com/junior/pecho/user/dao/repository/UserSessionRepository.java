package com.junior.pecho.user.dao.repository;

import com.junior.pecho.user.model.jpa.UserSession;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserSessionRepository extends ReactiveCrudRepository<UserSession,Long> {
}
