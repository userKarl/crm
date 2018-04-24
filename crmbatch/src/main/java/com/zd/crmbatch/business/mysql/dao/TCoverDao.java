package com.zd.crmbatch.business.mysql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.entity.TCover;

public interface TCoverDao extends JpaRepository<TCover, String> {

	List<TCover> findByFDate(String fDate);
}
