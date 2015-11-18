package com.alicankustemur.SpringHibernateExample.stock.dao;

public interface StockDao
{

	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);
}
