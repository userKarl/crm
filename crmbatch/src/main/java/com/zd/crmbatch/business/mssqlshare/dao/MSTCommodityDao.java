package com.zd.crmbatch.business.mssqlshare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.mssqlshare.entity.TCommodity;

public interface MSTCommodityDao extends JpaRepository<TCommodity, String> {

}
