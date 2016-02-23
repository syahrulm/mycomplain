package com.complain.my.common.dao;

import java.io.Serializable;

/**
 * Created by dikatok64633 on 2/24/2016.
 */
public abstract class AbstractCommonDAOImpl<T, ID extends Serializable> implements CommonDAO<T, ID> {
    public String create(T t) {
        return null;
    }

    public void update(T t) {

    }

    public void delete(T t) {

    }

    public T findById(ID id) {
        return null;
    }
}
