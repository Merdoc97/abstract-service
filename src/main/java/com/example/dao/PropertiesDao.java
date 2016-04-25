package com.example.dao;

import com.example.model.UserProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by artyo on 24.04.2016.
 */
@Repository
public interface PropertiesDao extends CrudRepository<UserProperties,Long> {
}
