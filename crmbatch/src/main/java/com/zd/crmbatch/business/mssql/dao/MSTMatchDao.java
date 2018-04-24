package com.zd.crmbatch.business.mssql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.entity.TMatch;

public interface MSTMatchDao extends JpaRepository<TMatch, String>{

	List<TMatch> findByFDateBetween(String fromDate,String toDate);
}
