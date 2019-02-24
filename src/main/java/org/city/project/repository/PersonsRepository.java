package org.city.project.repository;
import org.city.project.model.Persons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PersonsRepository extends CrudRepository<Persons, Long> {
    List<Persons> findPersonsByPersonsFirstName(String firtName);
}