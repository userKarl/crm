package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zd.crmbatch.business.entity.OrderDate;

public interface OrderDateDao extends JpaRepository<OrderDate, String> {

	@Query(value="SELECT max(FDate) FDate from torder ",nativeQuery=true)
	OrderDate findMaxFdate();
}
