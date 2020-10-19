package com.rptech.hmservice.config;

import com.rptech.hmservice.dao.BaseRepositoryImpl;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableJpaRepositories(basePackages = "com.rptech.hmservice.dao", repositoryBaseClass = BaseRepositoryImpl.class)
@EntityScan(basePackages="com.rptech.hmservice.model")
public class RepositoryConfig {
}