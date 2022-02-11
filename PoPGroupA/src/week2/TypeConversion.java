package week2;

public class TypeConversion {

	public static void main(String[] args) {
		//Type Conversion		
		//Type Cast 
			//Numeric to Numeric
				// Auto
				// Cast
		//Type Conversion
			//String to Numeric
			//Numeric to String
		
		//Auto conversion
		byte bn;
		short sn;
		int in;
		long ln;
		float fn;
		double dn;
		
		//Auto conversion (numeric to numeric)
		bn = 13;
		sn = bn;
		in = sn;
		ln = in;
		fn = ln;
		dn = fn;
		System.out.println(dn);
		
		//Type Casting
		dn = 123456789.123456789;
		//fn = dn; //Type mismatch: cannot convert from double to float
		fn = (float) dn; //cast to float
		System.out.println(fn); //1.23456792E8
		
		bn = (byte) dn;
		System.out.println(bn); //21 (value lost)
		
		//HW: Exponential format -> numeric	
		
		//Type conversion		
		//String to Numeric
		String str1 = "12345.6789";
		// dn = str1; //Type mismatch: cannot convert from String to double
		dn = Double.parseDouble(str1); //String to double
		System.out.println(dn); //12345.6789
		
		//Numeric to String
		dn=3456.789123;
		//str1 = dn; //Type mismatch: cannot convert from double to String
		str1 = Double.toString(dn);
		System.out.println(str1); //3456.789123		
	}

}
