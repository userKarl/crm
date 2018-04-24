package com.zd.crmbatch.business.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zd.crmbatch.business.mssql.dao.MSTClientCashDao;
import com.zd.crmbatch.business.mssql.dao.MSTClientFundDao;
import com.zd.crmbatch.business.mssql.dao.MSTCoverDao;
import com.zd.crmbatch.business.mssql.dao.MSTMatchDao;
import com.zd.crmbatch.business.mssql.dao.MSTOrderDao;
import com.zd.crmbatch.business.mysql.dao.ClientCashDateDao;
import com.zd.crmbatch.business.mysql.dao.ClientFundDateDao;
import com.zd.crmbatch.business.mysql.dao.CoverDateDao;
import com.zd.crmbatch.business.mysql.dao.MatchDateDao;
import com.zd.crmbatch.business.mysql.dao.OrderDateDao;
import com.zd.crmbatch.business.mysql.dao.TClientCashDao;
import com.zd.crmbatch.business.mysql.dao.TClientFundDao;
import com.zd.crmbatch.business.mysql.dao.TCoverDao;
import com.zd.crmbatch.business.mysql.dao.TMatchDao;
import com.zd.crmbatch.business.mysql.dao.TOrderDao;
import com.zd.crmbatch.business.utils.TimeUtil;

@Service
public class BatchService {

	private static final int batchSize=50;
	
	@Autowired
	private EntityManagerFactory mysqlEntityManagerFactory;
	
	@Autowired
	private TClientCashDao tClientCashDao;
	
	@Autowired
	private TClientFundDao tClientFundDao;
	
	@Autowired
	private TCoverDao tCoverDao;
	
	@Autowired
	private TMatchDao tMatchDao;
	
	@Autowired
	private TOrderDao tOrderDao;
	
	@Autowired
	private MSTClientCashDao msTClientCashDao;
	
	@Autowired
	private MSTClientFundDao msTClientFundDao;
	
	@Autowired
	private MSTCoverDao msTCoverDao;
	
	@Autowired
	private MSTMatchDao msTMatchDao;
	
	@Autowired
	private MSTOrderDao msTOrderDao;
	
	@Autowired
	private ClientCashDateDao clientCashDateDao;
	
	@Autowired
	private ClientFundDateDao clientFundDateDao;
	
	@Autowired
	private CoverDateDao coverDateDao;
	
	@Autowired
	private MatchDateDao matchDateDao;
	
	@Autowired
	private OrderDateDao orderDateDao;
	
	
	public <T> boolean insert(List<T> list){
		boolean b=false;
		if(list!=null && list.size()>0){
			EntityTransaction transaction = null;
			EntityManager mysqlEntityManager = mysqlEntityManagerFactory.createEntityManager();
			try {
			    transaction = mysqlEntityManager.getTransaction();
			    transaction.begin();
			 
			    for ( int i = 0; i < list.size(); ++i ) {
			        if ( i > 0 && i % batchSize == 0 ) {
			        	mysqlEntityManager.flush();
			        	mysqlEntityManager.clear();
			 
			            transaction.commit();
			            transaction.begin();
			        }
			        T o=list.get(i);
			        mysqlEntityManager.persist(o);
			    }
			    transaction.commit();
			    b=true;
			} catch (RuntimeException e) {
			    if ( transaction != null && 
			         transaction.isActive()) {
			        transaction.rollback();
			    }
			    throw e;
			} finally {
			    if (mysqlEntityManager != null) {
			    	mysqlEntityManager.close();
			    }
			}
		}
		return b;
	}
	
	/**
	 * 获取一年前的时间
	 * @return
	 */
	public DateTime lastYear(){
		return TimeUtil.minusTime(DateTime.now(), 1, TimeUtil.YEARS);
	}
	
	/**
	 * 出入金
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public void clientcash(String fromDate,String toDate){
		String maxDate=clientCashDateDao.findMaxFdate()==null?null:clientCashDateDao.findMaxFdate().getfDate();
		fromDate=StringUtils.isBlank(fromDate)?maxDate:fromDate;
		fromDate=StringUtils.isBlank(fromDate)?TimeUtil.dateTime2Str(lastYear(), TimeUtil.DSPdaytimeFormat):fromDate;
		toDate=StringUtils.isBlank(toDate)?TimeUtil.dateTime2Str(DateTime.now(), TimeUtil.DSPdaytimeFormat):toDate;
		if(StringUtils.isNotBlank(maxDate) && TimeUtil.str2DateTime(fromDate, TimeUtil.DSPdaytimeFormat).compareTo(
				TimeUtil.str2DateTime(maxDate, TimeUtil.DSPdaytimeFormat))<=0){
			//起始时间小于等于数据库已存数据的最大时间
			if(TimeUtil.str2DateTime(toDate, TimeUtil.DSPdaytimeFormat).compareTo(
					TimeUtil.str2DateTime(maxDate, TimeUtil.DSPdaytimeFormat))<=0){
				//截止时间小于等于数据库已存数据的最大时间
				tClientCashDao.save(msTClientCashDao.findByFDateBetween(fromDate,toDate));
			}else{
				//截止时间大于数据库已存数据的最大时间
				tClientCashDao.save(msTClientCashDao.findByFDateBetween(fromDate,maxDate));
				insert(msTClientCashDao.findByFDateBetween(TimeUtil.dateTime2Str(TimeUtil.str2DateTime(maxDate, 
						TimeUtil.DSPdaytimeFormat).plusDays(1), TimeUtil.DSPdaytimeFormat),toDate));
			}
		}else{
			insert(msTClientCashDao.findByFDateBetween(fromDate,toDate));
		}
	}
	
	/**
	 * 资金
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public void clientfund(String fromDate,String toDate){
		String maxDate=clientFundDateDao.findMaxFdate()==null?null:clientFundDateDao.findMaxFdate().getfDate();
		fromDate=StringUtils.isBlank(fromDate)?maxDate:fromDate;
		fromDate=StringUtils.isBlank(fromDate)?TimeUtil.dateTime2Str(lastYear(), TimeUtil.DSPdaytimeFormat):fromDate;
		toDate=StringUtils.isBlank(toDate)?TimeUtil.dateTime2Str(DateTime.now(), TimeUtil.DSPdaytimeFormat):toDate;
		if(StringUtils.isNotBlank(maxDate) && TimeUtil.str2DateTime(fromDate, TimeUtil.DSPdaytimeFormat).compareTo(
				TimeUtil.str2DateTime(maxDate, TimeUtil.DSPdaytimeFormat))<=0){
			//起始时间小于等于数据库已存数据的最大时间
			if(TimeUtil.str2DateTime(toDate, TimeUtil.DSPdaytimeFormat).compareTo(
					TimeUtil.str2DateTime(maxDate, TimeUtil.DSPdaytimeFormat))<=0){
				//截止时间小于等于数据库已存数据的最大时间
				tClientFundDao.save(msTClientFundDao.findByFDateBetween(fromDate,toDate));
			}else{
				//截止时间大于数据库已存数据的最大时间
				tClientFundDao.save(msTClientFundDao.findByFDateBetween(fromDate,maxDate));
				insert(msTClientFundDao.findByFDateBetween(TimeUtil.dateTime2Str(TimeUtil.str2DateTime(maxDate, 
						TimeUtil.DSPdaytimeFormat).plusDays(1), TimeUtil.DSPdaytimeFormat),toDate));
			}
		}else{
			insert(msTClientFundDao.findByFDateBetween(fromDate,toDate));
		}
	}
	
	/**
	 * 平仓
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public void cover(String fromDate,String toDate){
		String maxDate=coverDateDao.findMaxFdate()==null?null:coverDateDao.findMaxFdate().getfDate();
		fromDate=StringUtils.isBlank(fromDate)?maxDate:fromDate;
		fromDate=StringUtils.isBlank(fromDate)?TimeUtil.dateTime2Str(lastYear(), TimeUtil.DSPdaytimeFormat):fromDate;
		toDate=StringUtils.isBlank(toDate)?TimeUtil.dateTime2Str(DateTime.now(), TimeUtil.DSPdaytimeFormat):toDate;
		if(StringUtils.isNotBlank(maxDate) && TimeUtil.str2DateTime(fromDate, TimeUtil.DSPdaytimeFormat).compareTo(
				TimeUtil.str2DateTime(maxDate, TimeUtil.DSPdaytimeFormat))<=0){
			//起始时间小于等于数据库已存数据的最大时间
			if(TimeUtil.str2DateTime(toDate, TimeUtil.DSPdaytimeFormat).compareTo(
					TimeUtil.str2DateTime(maxDate, TimeUtil.DSPdaytimeFormat))<=0){
				//截止时间小于等于数据库已存数据的最大时间
				tCoverDao.save(msTCoverDao.findByFDateBetween(fromDate,toDate));
			}else{
				//截止时间大于数据库已存数据的最大时间
				tCoverDao.save(msTCoverDao.findByFDateBetween(fromDate,maxDate));
				insert(msTCoverDao.findByFDateBetween(TimeUtil.dateTime2Str(TimeUtil.str2DateTime(maxDate, 
						TimeUtil.DSPdaytimeFormat).plusDays(1), TimeUtil.DSPdaytimeFormat),toDate));
			}
		}else{
			insert(msTCoverDao.findByFDateBetween(fromDate,toDate));
		}
	}
	
	/**
	 * 成交
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public void match(String fromDate,String toDate){
		String maxDate=matchDateDao.findMaxFdate()==null?null:matchDateDao.findMaxFdate().getfDate();
		fromDate=StringUtils.isBlank(fromDate)?maxDate:fromDate;
		fromDate=StringUtils.isBlank(fromDate)?TimeUtil.dateTime2Str(lastYear(), TimeUtil.DSPdaytimeFormat):fromDate;
		toDate=StringUtils.isBlank(toDate)?TimeUtil.dateTime2Str(DateTime.now(), TimeUtil.DSPdaytimeFormat):toDate;
		if(StringUtils.isNotBlank(maxDate) && TimeUtil.str2DateTime(fromDate, TimeUtil.DSPdaytimeFormat).compareTo(
				TimeUtil.str2DateTime(maxDate, TimeUtil.DSPdaytimeFormat))<=0){
			//起始时间小于等于数据库已存数据的最大时间
			if(TimeUtil.str2DateTime(toDate, TimeUtil.DSPdaytimeFormat).compareTo(
					TimeUtil.str2DateTime(maxDate, TimeUtil.DSPdaytimeFormat))<=0){
				//截止时间小于等于数据库已存数据的最大时间
				tMatchDao.save(msTMatchDao.findByFDateBetween(fromDate,toDate));
			}else{
				//截止时间大于数据库已存数据的最大时间
				tMatchDao.save(msTMatchDao.findByFDateBetween(fromDate,maxDate));
				insert(msTMatchDao.findByFDateBetween(TimeUtil.dateTime2Str(TimeUtil.str2DateTime(maxDate, 
						TimeUtil.DSPdaytimeFormat).plusDays(1), TimeUtil.DSPdaytimeFormat),toDate));
			}
		}else{
			insert(msTMatchDao.findByFDateBetween(fromDate,toDate));
		}
	}
	
	/**
	 * 委托
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public void order(String fromDate,String toDate){
		String maxDate=orderDateDao.findMaxFdate()==null?null:orderDateDao.findMaxFdate().getfDate();
		fromDate=StringUtils.isBlank(fromDate)?maxDate:fromDate;
		fromDate=StringUtils.isBlank(fromDate)?TimeUtil.dateTime2Str(lastYear(), TimeUtil.DSPdaytimeFormat):fromDate;
		toDate=StringUtils.isBlank(toDate)?TimeUtil.dateTime2Str(DateTime.now(), TimeUtil.DSPdaytimeFormat):toDate;
		if(StringUtils.isNotBlank(maxDate) && TimeUtil.str2DateTime(fromDate, TimeUtil.DSPdaytimeFormat).compareTo(
				TimeUtil.str2DateTime(maxDate, TimeUtil.DSPdaytimeFormat))<=0){
			//起始时间小于等于数据库已存数据的最大时间
			if(TimeUtil.str2DateTime(toDate, TimeUtil.DSPdaytimeFormat).compareTo(
					TimeUtil.str2DateTime(maxDate, TimeUtil.DSPdaytimeFormat))<=0){
				//截止时间小于等于数据库已存数据的最大时间
				tOrderDao.save(msTOrderDao.findByFDateBetween(fromDate,toDate));
			}else{
				//截止时间大于数据库已存数据的最大时间
				tOrderDao.save(msTOrderDao.findByFDateBetween(fromDate,maxDate));
				insert(msTOrderDao.findByFDateBetween(TimeUtil.dateTime2Str(TimeUtil.str2DateTime(maxDate, 
						TimeUtil.DSPdaytimeFormat).plusDays(1), TimeUtil.DSPdaytimeFormat),toDate));
			}
		}else{
			insert(msTOrderDao.findByFDateBetween(fromDate,toDate));
		}
	}
}
