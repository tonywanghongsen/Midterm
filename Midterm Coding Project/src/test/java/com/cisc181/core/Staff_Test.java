package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	static ArrayList<Staff>staff_for_test ;
	static Staff Staff1;
	static Staff Staff2;
	static Staff Staff3;
	static Staff Staff4;
	static Staff Staff5;

	

	@BeforeClass
	public static void setup() {
		staff_for_test = new ArrayList<Staff>(); 
		Staff1 = new Staff(eTitle.MR);
		Staff2 = new Staff(eTitle.MS);
		Staff3 = new Staff(eTitle.MR);
		Staff4 = new Staff(eTitle.MS);
		Staff5 = new Staff(eTitle.MRS);
		staff_for_test.add(Staff1);
		staff_for_test.add(Staff2);
		staff_for_test.add(Staff3);
		staff_for_test.add(Staff4);
		staff_for_test.add(Staff5);
		Staff1.setSalary(50000);
		Staff2.setSalary(20000);
		Staff3.setSalary(10000);
		Staff4.setSalary(40000);
		Staff5.setSalary(30000);
		double Average = 0;
		double getsalary;
		double realaverage = ((50000+20000+10000+40000+30000)/5);
	
		for (Staff staff: staff_for_test){
			getsalary=staff.getSalary();
			Average = Average+getsalary;
		}
		Average=Average/5;
		assertTrue(Average==realaverage);
		
		
		
		

	
		
	}
	


	@Test
	public void test() {
		assertEquals(1,1);

	}	

}
