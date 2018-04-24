package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.mssqlshare.entity.TCommodity;

public interface TCommodityDao extends JpaRepository<TCommodity, String> {

}
