package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zd.crmbatch.business.mssqlshare.entity.ClientGroupFeeDate;

public interface ClientGroupFeeDateDao extends JpaRepository<ClientGroupFeeDate, String> {

	@Query(value="SELECT max(FModifyDate) FModifyDate from tclientgroupfee ",nativeQuery=true)
	ClientGroupFeeDate findMaxModifyDate();
}
