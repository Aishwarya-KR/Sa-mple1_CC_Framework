package com.crm.comcast.ProductTest;

import org.testng.annotations.Test;

public class SearchProductTest {


	@Test(groups="smokeTest")

	public void searchProductWithNameTest()
	{
		System.out.println("execute searchProductWithNameTest");
	}
	
	@Test(groups="regressionTest")
	public void searchProductWithIDTest()
	{
		System.out.println("execute searchProductWithIDTest");
	}

}
