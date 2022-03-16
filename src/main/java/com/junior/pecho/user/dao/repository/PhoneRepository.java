package com.junior.pecho.user.dao.repository;

import com.junior.pecho.user.model.jpa.Phone;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PhoneRepository extends ReactiveCrudRepository<Phone,Long> {
}
