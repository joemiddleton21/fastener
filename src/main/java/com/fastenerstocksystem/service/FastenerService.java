
package com.fastenerstocksystem.service;
import java.util.List;
import com.fastenerstocksystem.model.Fastener;


public interface FastenerService {
    List<Fastener> getAllFasteners();
    
    //Save fasteners by passing the Fastener object into the method
    void saveFastener(Fastener fastener);
    
    //get Fasteners by ID
    Fastener getFastenerById(long id);
    
    void deleteFastenerById(long id);
}
