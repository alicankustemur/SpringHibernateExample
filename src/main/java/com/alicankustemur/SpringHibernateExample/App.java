package com.alicankustemur.SpringHibernateExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alicankustemur.SpringHibernateExample.model.Stock;
import com.alicankustemur.SpringHibernateExample.stock.bo.StockBo;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/config/BeanLocation.xml");

		StockBo stockBo = (StockBo)applicationContext.getBean("stockBo");

		// insert

		Stock stock = new Stock();
		stock.setStockCode("1234");
		stock.setStockName("newStock");
		stockBo.save(stock);

		// select
		Stock stock2 = stockBo.findByStockCode("1234");
		System.out.println(stock2);

		// update
		//stock2.setStockName("newStock2");
		//stockBo.update(stock2);

		// delete
		//stockBo.delete(stock2);

	}
}
