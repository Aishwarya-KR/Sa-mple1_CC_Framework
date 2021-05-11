package com.crm.comcast.ProductTest;

import org.testng.annotations.Test;

public class CreateProductTest {

	@Test(groups="smokeTest")
	public void createProductWithNameTest()
	{
		String browser=System.getProperty("browser");
		System.out.println("BROWSER"+browser);
		System.out.println("execute createProductWithNameTest");
	}
	
	@Test(groups="regressionTest")
	public void createProductWithIDTest()
	{
		System.out.println("execute createProductWithIDTest");
	}
	

	@Test(groups="regressionTest")
	public void deleteProductWithIDTest()
	{
		System.out.println("execute createProductWithIDTest");
	}

}
