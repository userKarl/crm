package com.zd.crmbatch.business.mssqlshare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.mssqlshare.entity.TClientDefaultFee;

public interface MSTClientDefaultFeeDao extends JpaRepository<TClientDefaultFee, String> {

	List<TClientDefaultFee> findByfModifyDateBetween(String fromDate,String toDate);
}
