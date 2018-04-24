package com.zd.crmbatch.business.mysql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.entity.TClientCash;

public interface TClientCashDao extends JpaRepository<TClientCash, String>{

	List<TClientCash> findByFDate(String fDate);
}
