package org.cordova.ProyectoSorteos.repository;

import org.cordova.ProyectoSorteos.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository  extends JpaRepository<Ticket, Long>{
    
}
