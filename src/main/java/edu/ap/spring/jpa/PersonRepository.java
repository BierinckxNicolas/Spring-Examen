package edu.ap.spring.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nicolas on 06/09/2018.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
