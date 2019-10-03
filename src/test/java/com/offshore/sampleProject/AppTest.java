package com.offshore.sampleProject;


import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
    
   
{
	
	@Before
	public void beforeTest() {
		System.out.println("before");
	}
	
	 @Test
	 public void testOne() {
		 System.out.println("test");
		 
	 }
	 
	 @After
	 public void AfterTest() {
		 System.out.println("after");
			
		}
		
	 
   
}
