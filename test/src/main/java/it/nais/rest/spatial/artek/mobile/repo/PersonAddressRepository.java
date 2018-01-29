package it.nais.rest.spatial.artek.mobile.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import it.nais.rest.spatial.artek.mobile.base.Address;
import it.nais.rest.spatial.artek.mobile.base.Person;
import it.nais.rest.spatial.artek.mobile.base.PersonAddress;

@RepositoryRestResource(collectionResourceRel = "personAddresses", path = "personAddresses")
public interface PersonAddressRepository extends JpaRepository<PersonAddress, Long> {

	List<PersonAddress> findByPerson(@RequestParam("person")Person person);
	List<PersonAddress> findByPerson_Id(@RequestParam("person_Id")Long id);

	List<PersonAddress> findByAddress(@RequestParam("address")Address address);
	List<PersonAddress> findByAddress_Id(@RequestParam("address_Id")Long id);

	List<PersonAddress> findByPersonAndAddress(Person person, Address address);
	
	List<PersonAddress> findByPerson_IdAndAddress_Id(@RequestParam("person_Id")Long person_Id,@RequestParam("address_Id") Long address_Id);
	
	//TODO aggiunti qyuery che cerca per id e nome di  person e address 
//	List<PersonAddress> findByPerson(@Param("name") String name);
//
//	List<PersonAddress> findByPostalCode(@Param("name") String name);

}
