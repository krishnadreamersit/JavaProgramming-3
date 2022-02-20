package week3_lab;

//data types, variables
public class DataTypes {
	public static void main(String []args) {
		//basic data types
		//boolean, char, byte, short, int, long, float, double
		
		//declare variables of all types
		boolean res;
		char ch;
		byte bn;
		short sn;
		int in;
		long ln;
		float fn;
		double dn;
		
		//assign values
		res = true; //false
		ch = 'A';
		bn = 56;
		sn = 567;
		in = 56789;
		ln = 67891234;
		fn = 1234.56789F;
		dn = 123456789.87654321;
		
		//value access
		System.out.println(res);//true
		System.out.println(res+" "+ch);
		
		//value update
		res=false;
		System.out.println(res);//false
	}
}