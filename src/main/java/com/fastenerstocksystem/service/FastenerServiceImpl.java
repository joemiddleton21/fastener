
package com.fastenerstocksystem.service;

import com.fastenerstocksystem.model.Fastener;
import com.fastenerstocksystem.repository.FastenerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FastenerServiceImpl implements FastenerService{

    @Autowired
    private FastenerRepository fastenerRepository;
    @Override
//    Create get all fasteners method - return a list of fasteners to the controller
    public List<Fastener> getAllFasteners() {
        
        return fastenerRepository.findAll();
     }

    @Override
    public void saveFastener(Fastener fastener) {
       this.fastenerRepository.save(fastener);
    }

    @Override
    public Fastener getFastenerById(long id) {
        Optional<Fastener> optional=fastenerRepository.findById(id);
        Fastener fastener = null;
        if(optional.isPresent()){
            fastener = optional.get();
        }else{
                throw new RuntimeException(" Fastener not found for this id:: " + id);
        }
        return fastener;
    }

    @Override
    public void deleteFastenerById(long id) {
        this.fastenerRepository.deleteById(id);
    }
    
}
