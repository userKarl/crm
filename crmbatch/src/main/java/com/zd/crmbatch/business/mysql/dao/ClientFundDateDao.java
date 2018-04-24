package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.zd.crmbatch.business.entity.ClientFundDate;

public interface ClientFundDateDao extends JpaRepository<ClientFundDate, String> {

	@Query(value="SELECT max(FDate) FDate from tclientfund ",nativeQuery=true)
	ClientFundDate findMaxFdate();
}
