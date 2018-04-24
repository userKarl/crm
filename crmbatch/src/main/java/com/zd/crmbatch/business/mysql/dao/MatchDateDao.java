package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.zd.crmbatch.business.entity.MatchDate;

public interface MatchDateDao extends JpaRepository<MatchDate, String> {

	@Query(value="SELECT max(FDate) FDate from tmatch ",nativeQuery=true)
	MatchDate findMaxFdate();
}
