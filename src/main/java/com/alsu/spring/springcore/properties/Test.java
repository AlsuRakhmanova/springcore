package com.alsu.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/alsu/spring/springcore/properties/config.xml");
		CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) context.getBean("countryAndLands");
		System.out.println(countriesAndLanguages);
	}

}
