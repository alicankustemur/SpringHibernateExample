package com.alicankustemur.SpringHibernateExample.stock.bo;

import com.alicankustemur.SpringHibernateExample.model.Stock;

public interface StockBo
{
	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);

}
