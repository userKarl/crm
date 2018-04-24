package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.mssqlshare.entity.TClientBaseInfo;

public interface TClientBaseInfoDao extends JpaRepository<TClientBaseInfo, String> {

}
