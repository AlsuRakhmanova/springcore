package com.alsu.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {
	private Properties countryAndLands;

	public Properties getCountryAndLands() {
		return countryAndLands;
	}

	public void setCountryAndLands(Properties countryAndLands) {
		this.countryAndLands = countryAndLands;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [countryAndLands=" + countryAndLands + "]";
	}
	

}
