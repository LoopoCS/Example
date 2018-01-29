package it.nais.rest.spatial.artek.mobile.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import it.nais.rest.spatial.artek.mobile.base.Person;

@RepositoryRestResource(collectionResourceRel = "person", path = "people")
public interface PersonRepository extends JpaRepository<Person, Long> {

	List<Person> findById(Long id);

	List<Person> findByFirstName(@Param("name") String name);

	List<Person> findByLastName(@Param("name") String name);

}
