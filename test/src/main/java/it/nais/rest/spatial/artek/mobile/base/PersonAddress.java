package it.nais.rest.spatial.artek.mobile.base;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@IdClass(PersonAddressId.class)
@Table(name = "personAddress")
@Entity(name = "PersonAddress")
public class PersonAddress implements Serializable {

	/**
	 * lorenzo.terribili@nais-solutions.it created on Jan 25, 2018
	 */
	private static final long serialVersionUID = -5677259187741425615L;

	@Id
	@ManyToOne
	@JoinColumn(name="person_id")
	private Person person;

	@Id
	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;

	public PersonAddress() {
	}

	public PersonAddress(Person person, Address address) {
		this.person = person;
		this.address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonAddress that = (PersonAddress) o;
		return Objects.equals(person, that.person) && Objects.equals(address, that.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(person, address);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 *
	 * lorenzo.terribili@nais-solutions.it
	 *  created on Jan 29, 2018
	 */
	@Override
	public String toString() {
		return "PersonAddress [person=" + person + ", address=" + address + "]";
	}

	
}
class PersonAddressId implements Serializable {

	/**
	 * lorenzo.terribili@nais-solutions.it created on Jan 29, 2018
	 */
	private static final long serialVersionUID = -5845870128071792121L;
	private Long person;
	private Long address;

	public PersonAddressId() {
		super();
	}

	public PersonAddressId(Person person, Address address) {
		super();
		this.person = person.getId();
		this.address = address.getId();
	}

	

	/**
	 * @return the person
	 */
	public Long getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Long person) {
		this.person = person;
	}

	/**
	 * @return the address
	 */
	public Long getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Long address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object o) {

		if (o == this) {
			return true;
		}
		if (!(o instanceof PersonAddressId)) {
			return false;
		}
		PersonAddressId personAddress = (PersonAddressId) o;
		return Objects.equals(person, personAddress.getPerson())
				&& Objects.equals(address, personAddress.getAddress());
	}

	@Override
	public int hashCode() {
		return Objects.hash(person, address);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 *
	 * lorenzo.terribili@nais-solutions.it
	 *  created on Jan 29, 2018
	 */
	@Override
	public String toString() {
		return "PersonAddressId [person=" + person + ", address=" + address + "]";
	}
}