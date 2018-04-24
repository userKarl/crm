package com.zd.crmbatch.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.crmbatch.business.service.SettleService;

@Controller
@RequestMapping("/operate")
public class BatchController {

	@Autowired
	private SettleService batchService;
	
	@RequestMapping(value="/clientcash",method = {RequestMethod.GET,RequestMethod.POST},produces = "application/json; charset=utf-8")
	@ResponseBody
    public String clientcash(String fromDate,String toDate) throws InterruptedException{
		long t=System.currentTimeMillis();
		batchService.clientcash(fromDate,toDate);
		System.out.println(System.currentTimeMillis()-t);
		return "clientcash";
	}
	
	@RequestMapping(value="/clientfund",method = {RequestMethod.GET,RequestMethod.POST},produces = "application/json; charset=utf-8")
	@ResponseBody
    public String clientfund(String fromDate,String toDate) throws InterruptedException{
		batchService.clientfund(fromDate,toDate);
		return "clientfund";
	}
	
	@RequestMapping(value="/cover",method = {RequestMethod.GET,RequestMethod.POST},produces = "application/json; charset=utf-8")
	@ResponseBody
    public String cover(String fromDate,String toDate) throws InterruptedException{
		batchService.cover(fromDate,toDate);
		return "cover";
	}
	
	
	@RequestMapping(value="/match",method = {RequestMethod.GET,RequestMethod.POST},produces = "application/json; charset=utf-8")
	@ResponseBody
    public String match(String fromDate,String toDate) throws InterruptedException{
		batchService.match(fromDate,toDate);
		return "match";
	}
	
	@RequestMapping(value="/order",method = {RequestMethod.GET,RequestMethod.POST},produces = "application/json; charset=utf-8")
	@ResponseBody
    public String order(String fromDate,String toDate) throws InterruptedException{
		batchService.order(fromDate,toDate);
		return "order";
	}
	
}
