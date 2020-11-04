
public class MyDataType {

	public static void main(String[] args) {
		//by default all literals are of the type int
		byte var1=10;
		short var2=20;
		int var3=45;
//		long var4=75L;
		//if we want to specify that literal is long suffix it with L or l
		long var4=75l;
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		int varx=(int)var4;
		System.out.println("varx : "+varx);
		long vary=var3;
		System.out.println("vary : "+vary);
		
		//literal is of the base 10 ( Decimal ) 
		int vara=10;
		//literal is of the base 8 ( Octal)
		int varb=010;
		//Literal is of the base 16 ( hexadecimal)
//		int varc=0x10;
		int varc=0X10;
		//Literal is of the base 2 ( binary)
		int vard=0b10;
		
		System.out.println("Decimal vara : "+vara);
		System.out.println("Octal varb : "+varb);
		System.out.println("Hexa varc : "+varc);
		System.out.println("Binary vard : "+vard);

		System.out.println("==================");
		// by default all literals in floating category is of the type double
		
		double var9=75.4;
		
		float var8=(float)9.6;
		
//		float var7=9.7f;
		float var7=9.7F;
		
		System.out.println("var9 : "+var9);
		System.out.println("var8 : "+var8);
		System.out.println("var7 : "+var7);
		System.out.println("=======================");
		
		char varm='s';
		System.out.println("varm : "+varm);
		
		System.out.println("=================");
		
		boolean varn=false;
		System.out.println("varn : "+varn);
		
		System.out.println(10>5);
	}

}
