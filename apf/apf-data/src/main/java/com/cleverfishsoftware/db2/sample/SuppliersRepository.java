/*
 */
package com.cleverfishsoftware.db2.sample;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author peter
 */
public interface SuppliersRepository extends CrudRepository<Suppliers, String>{

    @Override
    void delete(Suppliers deleted);

    @Override
    List<Suppliers> findAll();

    @Override
    public Suppliers findOne(String id);

    @Override
    Suppliers save(Suppliers persisted);

}
