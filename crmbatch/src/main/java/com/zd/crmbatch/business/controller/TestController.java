package com.zd.crmbatch.business.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.crmbatch.business.entity.ClientCashDate;
import com.zd.crmbatch.business.entity.TClientCash;
import com.zd.crmbatch.business.entity.TMatch;
import com.zd.crmbatch.business.mssql.dao.MSTClientCashDao;
import com.zd.crmbatch.business.mssql.dao.MSTMatchDao;
import com.zd.crmbatch.business.mysql.dao.ClientCashDateDao;
import com.zd.crmbatch.business.mysql.dao.TClientCashDao;
import com.zd.crmbatch.business.service.SettleService;


@Controller
@RequestMapping("/test")
public class TestController {

	
	@Autowired
	private ClientCashDateDao dao;
	
	
	@RequestMapping(value="",method = {RequestMethod.GET,RequestMethod.POST},produces = "application/json; charset=utf-8")
	@ResponseBody
    public String clientcash() throws InterruptedException{
		 ClientCashDate findMaxFdate = dao.findMaxFdate();
		return findMaxFdate.getfDate();
	}
	
	
}
