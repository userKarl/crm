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
@EnableJpaRepositories(entityManagerFactoryRef = "mssqlEntityManagerFactoryShare", 
	transactionManagerRef = "mssqlTransactionManagerShare", 			
	basePackages = {"com.zd.crmbatch.business.mssqlshare.dao" })
public class MssqlShareConfig {
	
	@Autowired
	JpaVendorAdapter mssqlJpaVendorAdapterShare;
    
	@Bean(name = "mssqlDataSourceShare")
	public DataSource dataSource() {
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
		dsLookup.setResourceRef(true);
		DataSource dataSource = dsLookup.getDataSource("mssqlShareDS");		
		return dataSource;
	}

	@Bean(name = "mssqlEntityManagerFactoryShare")
	public EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
		lef.setDataSource(dataSource());

		lef.setJpaVendorAdapter(mssqlJpaVendorAdapterShare);
		lef.setPackagesToScan("com.zd.crmbatch.business.mssqlshare.entity");
		Properties jpaProperties = new Properties();
		jpaProperties.setProperty("hibernate.ejb.naming_strategy",
				"org.hibernate.cfg.DefaultNamingStrategy");
		jpaProperties.setProperty("hibernate.show_sql","false");
		lef.setJpaProperties(jpaProperties);
		lef.setPersistenceUnitName("mssqlPersistenceUnitShare");
		lef.afterPropertiesSet();	
		return lef.getObject();
	}

	@Bean(name = "mssqlEntityManagerShare")
	public EntityManager entityManager() {
		return entityManagerFactory().createEntityManager();
	}

	@Bean(name = "mssqlTransactionManagerShare")
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager(entityManagerFactory());
	}
	
}
