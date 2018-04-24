package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zd.crmbatch.business.mssqlshare.entity.ClientBaseInfoDate;

public interface ClientBaseInfoDateDao extends JpaRepository<ClientBaseInfoDate, String> {

	@Query(value="select max(ModifyDate) ModifyDate from tclientbaseinfo",nativeQuery=true)
	ClientBaseInfoDate findMaxModifyDate();
}
