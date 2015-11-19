package com.alicankustemur.SpringHibernateExample.stock.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.alicankustemur.SpringHibernateExample.model.Stock;
import com.alicankustemur.SpringHibernateExample.stock.dao.StockDao;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao
{

	@Override
	public void save(Stock stock)
	{
		getHibernateTemplate().save(stock);

	}

	@Override
	public void update(Stock stock)
	{
		getHibernateTemplate().update(stock);

	}

	@Override
	public void delete(Stock stock)
	{
		getHibernateTemplate().delete(stock);

	}

	@Override
	public Stock findByStockCode(String stockCode)
	{
		List list = getHibernateTemplate().find("from Stock where stockCode=?", stockCode);
		return (Stock)list.get(0);
	}

}
