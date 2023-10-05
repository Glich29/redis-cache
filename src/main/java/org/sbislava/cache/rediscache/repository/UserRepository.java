package org.sbislava.cache.rediscache.repository;

import org.sbislava.cache.rediscache.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
