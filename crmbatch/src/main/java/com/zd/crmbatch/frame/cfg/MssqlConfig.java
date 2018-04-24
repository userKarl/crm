package com.zd.crmbatch.frame.cfg;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "mssqlEntityManagerFactory", 
	transactionManagerRef = "mssqlTransactionManager", 			
	basePackages = {"com.zd.crmbatch.business.mssql.dao" })
public class MssqlConfig {
	
	@Autowired
	JpaVendorAdapter mssqlJpaVendorAdapter;
    
	@Bean(name = "mssqlDataSource")
	public DataSource dataSource() {
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
		dsLookup.setResourceRef(true);
		DataSource dataSource = dsLookup.getDataSource("mssqlSettleDS");		
		return dataSource;
	}

	@Bean(name = "mssqlEntityManagerFactory")
	public EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
		lef.setDataSource(dataSource());

		lef.setJpaVendorAdapter(mssqlJpaVendorAdapter);
		lef.setPackagesToScan("com.zd.crmbatch.business.entity");
		Properties jpaProperties = new Properties();
		jpaProperties.setProperty("hibernate.ejb.naming_strategy",
				"org.hibernate.cfg.DefaultNamingStrategy");
		jpaProperties.setProperty("hibernate.show_sql","false");
		lef.setJpaProperties(jpaProperties);
		lef.setPersistenceUnitName("mssqlPersistenceUnit");
		lef.afterPropertiesSet();	
		return lef.getObject();
	}

	@Bean(name = "mssqlEntityManager")
	public EntityManager entityManager() {
		return entityManagerFactory().createEntityManager();
	}

	@Bean(name = "mssqlTransactionManager")
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager(entityManagerFactory());
	}
	
}
