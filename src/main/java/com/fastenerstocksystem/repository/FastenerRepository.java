
package com.fastenerstocksystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fastenerstocksystem.model.Fastener;

@Repository
public interface FastenerRepository extends JpaRepository<Fastener, Long>{
    
}
