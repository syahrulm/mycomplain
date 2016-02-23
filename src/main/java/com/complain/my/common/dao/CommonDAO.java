package com.complain.my.common.dao;

import java.io.Serializable;

/**
 * Created by dikatok64633 on 2/24/2016.
 */
public interface CommonDAO<T, ID extends Serializable> {
    String create(T t);

    void update(T t);

    void delete(T t);

    T findById(ID id);
}
