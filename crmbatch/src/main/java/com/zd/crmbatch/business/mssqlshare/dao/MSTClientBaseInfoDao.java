package com.zd.crmbatch.business.mssqlshare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.mssqlshare.entity.TClientBaseInfo;

public interface MSTClientBaseInfoDao extends JpaRepository<TClientBaseInfo, String> {

	List<TClientBaseInfo> findByModifyDateBetween(String fromDate,String toDate);
}
