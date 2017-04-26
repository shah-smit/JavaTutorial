package com.studyguide.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordFinderTest {

	@Test
	public void wordNotFound()
	{
		assertEquals(false,WordFinder.wordExist("arbhor"));
	}
	
	@Test
	public void wordFound()
	{
		assertEquals(true,WordFinder.wordExist("abhor"));
	}
	
	@Test
	public void nullParameter()
	{
		assertEquals(false,WordFinder.wordExist(null));
	}
}
