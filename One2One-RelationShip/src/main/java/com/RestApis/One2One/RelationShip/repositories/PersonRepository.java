package com.RestApis.One2One.RelationShip.repositories;

import com.RestApis.One2One.RelationShip.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
