package com.rptech.hmservice.dao;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * The Interface BaseRepository.
 *
 * @param <T>
 *            the generic type
 * @param <ID>
 *            the generic type
 * @author bosesat
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

    final String DEFAULT_FETCH_SIZE = "5000";
    /**
     * Gets the session.
     *
     * @return the session
     */
    Session getSession();

    /**
     * Fetch data count.
     *
     * @return the long
     */
    Long fetchDataCount();

}