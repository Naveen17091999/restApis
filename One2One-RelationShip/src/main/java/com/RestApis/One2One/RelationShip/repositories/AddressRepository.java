package com.RestApis.One2One.RelationShip.repositories;

import com.RestApis.One2One.RelationShip.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
