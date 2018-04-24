package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.mssqlshare.entity.TClientTradeFee;

public interface TClientTradeFeeDao extends JpaRepository<TClientTradeFee, String> {

}
