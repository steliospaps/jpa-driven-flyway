package io.github.steliospaps.examples.jpa.flyway.generator;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.steliospaps.examples.jpa.flyway.generator.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByName(String name);

}
