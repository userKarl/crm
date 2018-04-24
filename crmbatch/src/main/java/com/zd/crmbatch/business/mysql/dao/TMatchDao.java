package com.zd.crmbatch.business.mysql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.entity.TMatch;

public interface TMatchDao extends JpaRepository<TMatch, String>{

	List<TMatch> findByFDate(String fDate);
}
