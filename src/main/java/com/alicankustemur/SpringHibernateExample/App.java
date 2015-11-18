package com.alicankustemur.SpringHibernateExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alicankustemur.SpringHibernateExample.stock.bo.StockBo;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

		StockBo stockBo = (StockBo)applicationContext.getBean("stockBo");

	}
}
