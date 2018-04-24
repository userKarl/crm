package com.zd.crmbatch.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import com.zd.crmbatch.business.service.BatchService;

@Controller
public class TaskController {

	@Autowired
	private BatchService batchService;
	
	@Scheduled(cron = "0 0 0 * * ?")
	public void task(){
		batchService.clientcash(null, null);
		batchService.clientfund(null, null);
		batchService.cover(null, null);
		batchService.match(null, null);
		batchService.order(null, null);
	}
	
}
