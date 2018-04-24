package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zd.crmbatch.business.mssqlshare.entity.ClientDefaultFeeDate;

public interface ClientDefaultFeeDateDao extends JpaRepository<ClientDefaultFeeDate, String> {

	@Query(value="select max(FModifyDate) FModifyDate from tclientdefaultfee",nativeQuery=true)
	ClientDefaultFeeDate findMaxModifyDate();
}
