package org.cordova.ProyectoSorteos.repository;

import org.cordova.ProyectoSorteos.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    
}
