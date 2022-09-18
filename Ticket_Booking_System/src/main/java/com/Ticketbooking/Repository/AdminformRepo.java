package com.Ticketbooking.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Ticketbooking.model.*;

@Repository
public interface AdminformRepo extends JpaRepository<Adminformmodel, Long>{
                                              
}