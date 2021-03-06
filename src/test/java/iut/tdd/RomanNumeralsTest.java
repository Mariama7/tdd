package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1 () {
		//Given
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
		
		@Test
		public void should_return_II_when_2 () {
			//Given
			String input = "2";
			String expected = "II";
			RomanNumerals romanNumeral = new RomanNumerals();
			//When
			String actual = romanNumeral.convertToRoman(input);
			//Then
			Assert.assertEquals(expected, actual);
		
	
	}
		
		

		@Test
		public void should_return_III_when_3 () {
			//Given
			String input = "3";
			String expected = "III";
			RomanNumerals romanNumeral = new RomanNumerals();
			//When
			String actual = romanNumeral.convertToRoman(input);
			//Then
			Assert.assertEquals(expected, actual);
		
	
	}
		
		
		
		
		
		
		
		
}
