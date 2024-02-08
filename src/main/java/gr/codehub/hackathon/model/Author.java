package gr.codehub.hackathon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@SuperBuilder

public class Author  {

	private String firstname;

	private String lastname;

	private String email;

	private Set<Activity> activities = new HashSet<>();
}
