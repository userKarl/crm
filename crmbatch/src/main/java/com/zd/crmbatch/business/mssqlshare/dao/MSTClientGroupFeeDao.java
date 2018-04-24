package com.zd.crmbatch.business.mssqlshare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.mssqlshare.entity.TClientGroupFee;

public interface MSTClientGroupFeeDao extends JpaRepository<TClientGroupFee, String> {

	List<TClientGroupFee> findByfModifyDateBetween(String fromDate,String toDate);
}
