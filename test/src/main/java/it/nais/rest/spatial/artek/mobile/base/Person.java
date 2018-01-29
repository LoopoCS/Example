package it.nais.rest.spatial.artek.mobile.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Table(name = "person")
@Entity(name = "Person")
public class Person implements Serializable {

	/**
	 * lorenzo.terribili@nais-solutions.it
	 *  created on Jan 25, 2018
	 */
	private static final long serialVersionUID = 2754260606958578049L;

	@Id
	@GeneratedValue
	private Long id;

	@NaturalId
	private String registrationNumber;

	@Column
	private String lastName;

	@Column
	private String firstName;

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PersonAddress> addresses = new ArrayList<>();

	public Person() {
	}

	public Person(String registrationNumber, String lastName, String firstName, List<PersonAddress> addresses) {
		super();
		this.registrationNumber = registrationNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.addresses = addresses;
	}

	public Long getId() {
		return id;
	}

	/**
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @param registrationNumber
	 *            the registrationNumber to set
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public List<PersonAddress> getAddresses() {
		return addresses;
	}

	public void addAddress(Address address) {
		PersonAddress personAddress = new PersonAddress(this, address);
		addresses.add(personAddress);
		address.getOwners().add(personAddress);
	}

	public void removeAddress(Address address) {
		PersonAddress personAddress = new PersonAddress(this, address);
		address.getOwners().remove(personAddress);
		addresses.remove(personAddress);
		personAddress.setPerson(null);
		personAddress.setAddress(null);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Person person = (Person) o;
		return Objects.equals(registrationNumber, person.registrationNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(registrationNumber);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 *
	 * lorenzo.terribili@nais-solutions.it
	 *  created on Jan 29, 2018
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", registrationNumber=" + registrationNumber + ", lastName=" + lastName
				+ ", firstName=" + firstName + ", addresses=" + addresses + "]";
	}
	
}