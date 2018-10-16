package dayTwo.Expression;

public class TypeCasting {
	
	public static void main(String[] args) {
	
		//Implicit casting - widening the range of a data type based on the conversion
		//Explicit casting - narrowing the range
		// any data type can be convertedn to another data type by castiing
		
		int i = 100;
		
		long l = i;
		
		float f = l;
		char c = 'c';
		int num = 666;
		byte numb = (byte) num;
		
		c = (char)num;
		
		double d = 100.34;
		long p = (long)d;
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(num);
		System.out.println(c);
		System.out.println(d);
		System.out.println(p);
		System.out.println(numb);
	}
	
}
