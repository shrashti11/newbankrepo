package com.way2learnonline.services.tests;

import java.sql.SQLException;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.way2learnonline.service.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:"})
public class BankServiceTests {	
	
	@Autowired
	private BankService bankService;
	
	/*@Before
	public void init() throws Exception{
		
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("application-config.xml","infrastructure-config.xml");
		
		
		bankService=context.getBean("bankService",BankService.class);
		context.close();
	}	*/

	@Test
	@DirtiesContext
	public void testTransfer() throws SQLException{
		
		Long transactionId=bankService.transfer(new Long(1), new Long(2), 5000);
		assertNotNull(transactionId);
	}
	
	
	@Test
	public void testTransfer1() throws SQLException{
		
		Long transactionId=bankService.transfer(new Long(1), new Long(2), 5000);
		assertNotNull(transactionId);
	}
	

}
