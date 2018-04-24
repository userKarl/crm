package com.zd.crmbatch.business.mysql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.entity.TClientFund;

public interface TClientFundDao extends JpaRepository<TClientFund, String> {

	List<TClientFund> findByFDate(String fDate);
}
