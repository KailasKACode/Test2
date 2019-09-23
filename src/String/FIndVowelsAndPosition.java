package String;

public class FIndVowelsAndPosition {
	public static void main(String[] args) {
		String str="ThaAis is for interhiiiview";
		//str = str.toLowerCase();
		String str2="aeiouAEIOU";
		for (int i = 0; i < str.length(); i++) {
		  for (int k = 0; k < str2.length(); k++) {
			  if(str.charAt(i)==str2.charAt(k)) {
				  System.out.println("vowel is : "+str.charAt(i) +" on index value : "+i);
			  }
		}
				
		}
	
	}

}
