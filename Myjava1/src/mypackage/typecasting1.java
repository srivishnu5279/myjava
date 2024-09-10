package mypackage;

public class typecasting1 {

	public static void main(String[] args) {
		// implict
		byte b=127;
		int i=b;
		System.out.println(i);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		//explict
		double f1=10.52d;
		long l = (long)f1;
		System.out.println(l);
		
	}

}
