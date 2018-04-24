package com.zd.crmbatch.business.mssql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.entity.TOrder;

public interface MSTOrderDao extends JpaRepository<TOrder, String> {

	List<TOrder> findByFDateBetween(String fromDate,String toDate);
}
