package InterviewPractice;

public class ToCheckUpperCaseAndConvertLover {
	public static void main(String[] args) {
		String str="TeSTinG",str2="";
		int n=str.length();
		System.out.println(n);
		for (int i = 0; i <=n-1; i++) {
			if(str.charAt(i)>65 && str.charAt(i)<90 )
			{
				System.out.println(str.toLowerCase());
				
			}
			else
				if(str.charAt(i)>97 && str.charAt(i)<122)
				{
					str2=str2+str.charAt(i);
					System.out.println(str2);
				}
			
		}
		
	}
	

}
