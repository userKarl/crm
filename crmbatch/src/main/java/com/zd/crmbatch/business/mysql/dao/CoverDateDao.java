package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.zd.crmbatch.business.entity.CoverDate;

public interface CoverDateDao extends JpaRepository<CoverDate, String> {

	@Query(value="SELECT max(FDate) FDate from tcover ",nativeQuery=true)
	CoverDate findMaxFdate();
}
