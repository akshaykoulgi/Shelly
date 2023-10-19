package Executiontest;

import java.util.Properties;

import org.testng.annotations.Test;

import keyword.engine.KeywordEngine;

public class Logintest {
	
	KeywordEngine ke = new KeywordEngine();
	
	Properties prop = new Properties();
	@Test
	public void DemoTest() throws Exception {
		
		ke.startExecution("Sheet1");
		
		
		
	}

}
