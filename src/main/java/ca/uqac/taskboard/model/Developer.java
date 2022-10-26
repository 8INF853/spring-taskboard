package ca.uqac.taskboard.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Developer {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;


	private Developer() {}

	public Developer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

  //getters and setters, equals, hash, toString methods

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Developer developer = (Developer) o;
		return Objects.equals(id, developer.id) &&
			Objects.equals(firstName, developer.firstName)
      && Objects.equals(lastName, developer.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Developer{" +
			"id=" + id +
			", firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			'}';
	}
}