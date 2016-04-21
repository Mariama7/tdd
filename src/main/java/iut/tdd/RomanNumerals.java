package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String romain = "";
		for(int i=1; i<3; i++){
			romain += "I";
		}
		return romain;
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}

