package org.city.project.repository;

import org.city.project.entity.Houses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HousesRepository extends JpaRepository<Houses, Long> {

}
