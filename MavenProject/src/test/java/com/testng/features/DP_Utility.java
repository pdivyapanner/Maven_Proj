package com.testng.features;

import org.testng.annotations.DataProvider;

public class DP_Utility {

	@DataProvider
	public String[][] multiple_data() {
		String[][]data = {
				{"divya","vinay"},
				{"lakshan","deepi"}};
		return data;
		}
	
}
