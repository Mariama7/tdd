package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int nombre = Integer.parseInt(arabe);
		String romain = "";
		for(int i=0; i<nombre; i++){
			romain += "I";
		}
		return romain;
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}

