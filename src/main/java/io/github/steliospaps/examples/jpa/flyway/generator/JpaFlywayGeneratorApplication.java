package io.github.steliospaps.examples.jpa.flyway.generator;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.github.steliospaps.examples.jpa.flyway.generator.model.User;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class JpaFlywayGeneratorApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JpaFlywayGeneratorApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setName("stelios");
		log.info("saving {}", user);
		userRepository.save(user);
		log.info("saved {}", user);
		
		user = userRepository.findByName("stelios");
		log.info("loaded {}", user);
	}

}
