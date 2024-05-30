package org.cordova.ProyectoSorteos.service;

import org.cordova.ProyectoSorteos.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository repository;

    
}
