public class TypeCasting {
	
	{
		System.out.println("Instance block");
	}
	
	static
	{
		System.out.println("Static blocks");
	}
	
	public static void main(String[] args) {
		System.out.println("Mian method");
		String c="2252";
		//float d=(Float)c;
		
		float b=Float.parseFloat(c);
		System.out.println(b);
		
		int bb=20;
		String cj=String.valueOf(bb);
		System.out.println(cj);
		
		String mm="4";
		
		byte v=Byte.parseByte(mm);
		System.out.println("byte  "+v);
		
		float g=Float.parseFloat(mm);
		System.out.println("float "+g);
		
		int k=Integer.parseInt(mm);
		System.out.println("int "+k);
		
		
		double lm=Double.parseDouble(mm);
		System.out.println("double: "+lm);
		
		short tt=Short.parseShort(mm);
		System.out.println("Short "+tt);
		
		long ll=Long.parseLong(mm);
		System.out.println("long "+ll);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
