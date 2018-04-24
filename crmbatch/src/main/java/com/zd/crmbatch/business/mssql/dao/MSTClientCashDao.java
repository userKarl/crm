package com.zd.crmbatch.business.mssql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.entity.TClientCash;

public interface MSTClientCashDao extends JpaRepository<TClientCash, String>{

	List<TClientCash> findByFDateBetween(String fromDate,String toDate);
}
