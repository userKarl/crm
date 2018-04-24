package com.zd.crmbatch.business.mssqlshare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.mssqlshare.entity.TClientTradeFee;

public interface MSTClientTradeFeeDao extends JpaRepository<TClientTradeFee, String> {

	List<TClientTradeFee> findByfModifyDateBetween(String fromDate,String toDate);
}
