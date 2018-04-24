package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zd.crmbatch.business.entity.ClientCashDate;

public interface ClientCashDateDao extends JpaRepository<ClientCashDate, String> {

	@Query(value="SELECT max(FDate) FDate from tclientcash ",nativeQuery=true)
	ClientCashDate findMaxFdate();
}
