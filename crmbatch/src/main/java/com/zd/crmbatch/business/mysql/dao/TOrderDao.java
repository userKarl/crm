package com.zd.crmbatch.business.mysql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zd.crmbatch.business.entity.TOrder;

public interface TOrderDao extends JpaRepository<TOrder, String> {

	List<TOrder> findByFDate(String fDate);
}
