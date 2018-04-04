package com.mitrais.core.data.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by duongtuan1211 on 3/30/2018.
 */
public interface GenericDao<ID extends Serializable,T> {
    List<T> findAll();
    T update(T entity);
    void save(T entity);
    T findById(ID var1);
}
