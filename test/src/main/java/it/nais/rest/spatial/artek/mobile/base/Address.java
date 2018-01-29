package it.nais.rest.spatial.artek.mobile.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "address")
@Entity(name = "Address")
public class Address implements Serializable {

	private static final long serialVersionUID = 3321581384377657629L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "`street`")
	private String street;

	@Column(name = "`number`")
	private String number;

	@Column(name = "`postal_Code`")
	private String postalCode;

	@OneToMany(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PersonAddress> owners = new ArrayList<>();

	public Address() {
	}

	public Address(String street, String number, String postalCode) {
		this.street = street;
		this.number = number;
		this.postalCode = postalCode;
	}

	public Long getId() {
		return id;
	}

	public String getStreet() {
		return street;
	}

	public String getNumber() {
		return number;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public List<PersonAddress> getOwners() {
		return owners;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Address address = (Address) o;
		return Objects.equals(street, address.street) && Objects.equals(number, address.number)
				&& Objects.equals(postalCode, address.postalCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(street, number, postalCode);
	}

	@Override
	public String toString() {
		return getId().toString();
	}
	
}