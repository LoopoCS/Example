package it.nais.rest.spatial.artek.mobile.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import it.nais.rest.spatial.artek.mobile.base.Address;
import it.nais.rest.spatial.artek.mobile.base.Person;

@RepositoryRestResource(collectionResourceRel = "addresses", path = "addresses")
public interface AddressRepository extends JpaRepository<Address, Long> {

	List<Person> findById(Long id);

	List<Person> findByStreet(@Param("name") String name);

	List<Person> findByPostalCode(@Param("name") String name);

}
