package io.github.steliospaps.examples.jpa.flyway.generator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	private Long id;
	private String name;
}
