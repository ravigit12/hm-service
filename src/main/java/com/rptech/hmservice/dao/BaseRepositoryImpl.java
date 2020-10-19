package com.rptech.hmservice.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.jboss.logging.Logger;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * The Class BaseRepositoryImpl.
 *
 * @param <T>
 *            the generic type
 * @param <ID>
 *            the generic type
 */
@NoRepositoryBean
@Transactional(transactionManager = "transactionManagerInternalDataHub")
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
        implements BaseRepository<T, ID> {
    final Logger logger = Logger.getLogger(BaseRepositoryImpl.class);

    @PersistenceContext(unitName = "internalDataHubPersistenceUnit")
    private EntityManager entityManager;

    /*
     * (non-Javadoc)
     * 
     * @see com.db.fatca.idh.ict.ictdataservices.dao.repository.BaseRepository#
     * getSession()
     */
    @Override
    public Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    /**
     * Instantiates a new base repository impl.
     *
     * @param domainClass
     *            the domain class
     * @param entityManager
     *            the entity manager
     */
    public BaseRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityManager = entityManager;
    }

    /**
     * Instantiates a new base repository impl.
     *
     * @param entityInformation
     *            the entity information
     * @param entityManager
     *            the entity manager
     */
    public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.db.fatca.idh.ict.ictdataservices.dao.repository.BaseRepository#
     * fetchDataCount()
     */
    @Override
    public Long fetchDataCount() {
        Criteria criteriaCount = getSession().createCriteria(this.getDomainClass());
        criteriaCount.setProjection(Projections.rowCount());
        return (Long) criteriaCount.uniqueResult();
    }

}