package com.zd.crmbatch.business.mssql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.entity.TCover;

public interface MSTCoverDao extends JpaRepository<TCover, String> {

	List<TCover> findByFDateBetween(String fromDate,String toDate);
}
