package com.alicankustemur.SpringHibernateExample.stock.bo.impl;

import com.alicankustemur.SpringHibernateExample.model.Stock;
import com.alicankustemur.SpringHibernateExample.stock.bo.StockBo;
import com.alicankustemur.SpringHibernateExample.stock.dao.StockDao;

public class StockBoImpl implements StockBo
{

	StockDao stockDao;

	public StockDao getStockDao()
	{
		return stockDao;
	}

	public void setStockDao(StockDao stockDao)
	{
		this.stockDao = stockDao;
	}

	@Override
	public void save(Stock stock)
	{
		// VTODO Auto-generated method stub

	}

	@Override
	public void update(Stock stock)
	{
		// VTODO Auto-generated method stub

	}

	@Override
	public void delete(Stock stock)
	{
		// VTODO Auto-generated method stub

	}

	@Override
	public Stock findByStockCode(String stockCode)
	{
		// VTODO Auto-generated method stub
		return null;
	}

}
