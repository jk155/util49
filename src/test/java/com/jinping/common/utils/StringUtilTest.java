package com.jinping.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String string=null;
		System.out.println(StringUtil.hasLength(string));
	}

	@Test
	public void testHasText() {
		String string=" s ";
		System.out.println(StringUtil.hasText(string));
	}

	@Test
	public void testRandomChineseString() {
		System.out.println(StringUtil.randomChineseString(20));
	}

	@Test
	public void testGenerateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}

}
