package com.leetcode.oj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompareVersionNumbersTest {

	CompareVersionNumbers cvn = new CompareVersionNumbers();

	@Test
	public void testCompareVersion1(){
		String v1="1.0.0.0.1";
		String v2="1.0.0.0.1";
		assertEquals(compareVersion(v1, v2), 0);
	}
	
	@Test
	public void testCompareVersion2(){
		String v1="1.0.0.0.2";
		String v2="1.0.0.0.1";
		assertEquals(compareVersion(v1, v2), 1);
	}
	
	@Test
	public void testCompareVersion3(){
		String v1="1.0.0.0.1";
		String v2="1.0.0.0.2";
		assertEquals(compareVersion(v1, v2), -1);
	}
	
	@Test
	public void testCompareVersion4(){
		String v1="1.0.0.000.1";
		String v2="1.0.0.0.1";
		assertEquals(compareVersion(v1, v2), 0);
	}
	
	@Test
	public void testCompareVersion5(){
		String v1="1.0.0.000.1";
		String v2="1.0.0.0.1.010";
		assertEquals(compareVersion(v1, v2), -1);
	}
	
	@Test
	public void testCompareVersion6(){
		String v1="1.0.0.000.1";
		String v2="1.0.0.0.1.00";
		assertEquals(compareVersion(v1, v2), 0);
	}
	
	@Test
	public void testCompareVersion7(){
		String v1="1.0";
		String v2="1";
		assertEquals(compareVersion(v1, v2), 0);
	}
	
	private int compareVersion(String v1, String v2){
		return cvn.compareVersion(v1, v2);
	}
}