/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kbtg.bootcamp.posttest.lottery;

import jakarta.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.Optional;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author thinnapath
 */
@Repository
public interface LotteryRepository extends JpaRepository<Lottery, Long>{

    public Optional<Lottery> findBy(SingularAttribute<AbstractPersistable, Serializable> id);
    
}
