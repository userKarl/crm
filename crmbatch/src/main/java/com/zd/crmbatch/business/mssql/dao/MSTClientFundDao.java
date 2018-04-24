package com.zd.crmbatch.business.mssql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.entity.TClientFund;

public interface MSTClientFundDao extends JpaRepository<TClientFund, String> {

	List<TClientFund> findByFDateBetween(String fromDate,String toDate);
}
