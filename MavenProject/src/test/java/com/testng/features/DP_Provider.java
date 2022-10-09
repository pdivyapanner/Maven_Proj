package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_Provider {
	
	@Test(dataProvider = "multiple_data", dataProviderClass = DP_Utility.class)
public void family_data(String team,String group) {
	System.out.println(team);
	System.out.println(group);
}
}



