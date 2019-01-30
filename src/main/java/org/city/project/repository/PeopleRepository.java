package org.city.project.repository;
import org.city.project.model.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PeopleRepository extends CrudRepository<People, Long> {
    List<People> findPeopleBypeopleFirstName(String firtName);
}