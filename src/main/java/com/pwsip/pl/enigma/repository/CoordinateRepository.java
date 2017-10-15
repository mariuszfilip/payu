package com.pwsip.pl.enigma.repository;

import com.pwsip.pl.enigma.entity.CoordinateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mariusz on 15.10.17.
 */
@Repository
public interface CoordinateRepository extends CrudRepository<CoordinateEntity,Long>{
}
