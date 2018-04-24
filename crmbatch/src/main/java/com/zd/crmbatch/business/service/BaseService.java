package com.zd.crmbatch.business.service;

import org.joda.time.DateTime;

import com.zd.crmbatch.business.utils.TimeUtil;

public class BaseService {

	/**
	 * 获取一年前的时间
	 * @return
	 */
	public DateTime lastYear(){
		return TimeUtil.minusTime(DateTime.now(), 1, TimeUtil.YEARS);
	}
}
