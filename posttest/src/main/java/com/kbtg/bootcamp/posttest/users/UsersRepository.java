/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kbtg.bootcamp.posttest.users;

import jakarta.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author thinnapath
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

    public Optional<Users> findBy(SingularAttribute<AbstractPersistable, Serializable> id);

    public List<Users> findBy(String user_id);
    
}
