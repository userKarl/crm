package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zd.crmbatch.business.mssqlshare.entity.ClientTradeFeeDate;

public interface ClientTradeFeeDateDao extends JpaRepository<ClientTradeFeeDate, String> {
	
	@Query(value="SELECT max(FModifyDate) FModifyDate from tclienttradefee ",nativeQuery=true)
	ClientTradeFeeDate findMaxModifyDate();
}
