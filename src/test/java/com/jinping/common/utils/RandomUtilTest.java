package com.jinping.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 100; i++) {
			System.out.print(RandomUtil.random(3, 9)+" ");
		}
		
	}

	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(3, 9, 5);
		for (int i : subRandom) {
			System.out.print(i+" ");
		}
	}

	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 100; i++) {
			System.out.print(RandomUtil.randomCharacter()+" ");
			if(i==99) {
				System.err.println("OK");
			}
		}
	}

	@Test
	public void testRandomString() {
		System.out.println(RandomUtil.randomString(5));
	}

}
