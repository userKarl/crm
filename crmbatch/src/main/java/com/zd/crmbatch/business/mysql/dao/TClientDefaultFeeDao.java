package com.zd.crmbatch.business.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.mssqlshare.entity.TClientDefaultFee;

public interface TClientDefaultFeeDao extends JpaRepository<TClientDefaultFee, String> {

}
