package com.alicankustemur.SpringHibernateExample.stock.bo.impl;

import com.alicankustemur.SpringHibernateExample.stock.bo.StockBo;

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

	public void save(Stock stock)
	{
		// VTODO Auto-generated method stub

	}

	public void update(Stock stock)
	{
		// VTODO Auto-generated method stub

	}

	public void delete(Stock stock)
	{
		// VTODO Auto-generated method stub

	}

	public Stock findByStockCode(String stockCode)
	{
		// VTODO Auto-generated method stub
		return null;
	}

}
